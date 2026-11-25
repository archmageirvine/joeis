package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Element order distributions in GL(2,Z_n).
 * @author Gregory Morse
 * @author Sean A. Irvine
 */
public final class Gl2ElementOrders {

  private final Map<Integer, Z[]> mPrimePowers = new HashMap<>();

  private static Z fieldRoots(final Z p, final Z k) {
    final Z split = k.gcd(p.subtract(1));
    final Z nonsplit = k.gcd(p.square().subtract(1)).subtract(split);
    // Scalars, nontrivial Jordan blocks, split pairs, nonsplit pairs.
    return split.add(k.mod(p).isZero() ? split.multiply(p.square().subtract(1)) : Z.ZERO)
      .add(split.multiply(split.subtract(1)).divide2().multiply(p.multiply(p.add(1))))
      .add(nonsplit.divide2().multiply(p.multiply(p.subtract(1))));
  }

  private Z[] primePowerOrders(final int modulus) {
    return mPrimePowers.computeIfAbsent(modulus, Gl2ElementOrders::enumerateOrders);
  }

  private static int[] multiply(final int[] x, final int[] y, final int n) {
    return new int[] {
      Math.floorMod((long) x[0] * y[0] + (long) x[1] * y[2], n),
      Math.floorMod((long) x[0] * y[1] + (long) x[1] * y[3], n),
      Math.floorMod((long) x[2] * y[0] + (long) x[3] * y[2], n),
      Math.floorMod((long) x[2] * y[1] + (long) x[3] * y[3], n),
    };
  }

  private static int order(final int[] m, final int n) {
    int[] p = m;
    int k = 1;
    while (!(p[0] == 1 && p[1] == 0 && p[2] == 0 && p[3] == 1)) {
      p = multiply(p, m, n);
      ++k;
    }
    return k;
  }

  // Enumerate only the non-field prime-power factors; the field
  // factors use conjugacy types and CRT assembles the composite result.
  private static Z[] enumerateOrders(final int n) {
    final ArrayList<Z> counts = new ArrayList<>();
    final Z modulus = Z.valueOf(n);
    for (int a = 0; a < n; ++a) {
      for (int b = 0; b < n; ++b) {
        for (int c = 0; c < n; ++c) {
          for (int d = 0; d < n; ++d) {
            if (Z.valueOf((long) a * d - (long) b * c).gcd(modulus).isOne()) {
              final int index = order(new int[] {a, b, c, d}, n) - 1;
              while (counts.size() <= index) {
                counts.add(Z.ZERO);
              }
              counts.set(index, counts.get(index).add(1));
            }
          }
        }
      }
    }
    return counts.toArray(new Z[0]);
  }

  /**
   * Count solutions of x^k = I.
   * @param modulus positive modulus
   * @param k exponent
   * @return number of solutions
   */
  public Z roots(final int modulus, final Z k) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Z result = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e == 1) {
        result = result.multiply(fieldRoots(p, k));
      } else {
        final Z[] counts = primePowerOrders(p.pow(e).intValueExact());
        Z roots = Z.ZERO;
        for (int i = 1; i <= counts.length; ++i) {
          if (k.mod(Z.valueOf(i)).isZero()) {
            roots = roots.add(counts[i - 1]);
          }
        }
        result = result.multiply(roots);
      }
    }
    return result;
  }

  /**
   * Count elements by exact order.
   * @param modulus positive modulus
   * @return the nonzero counts, keyed by order
   */
  public Map<Z, Z> distribution(final int modulus) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Map<Z, Z> result = Map.of(Z.ONE, Z.ONE);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Map<Z, Z> local = new HashMap<>();
      if (e == 1) {
        final Z[] divisors = Jaguar.factor(p.multiply(p.square().subtract(1))).divisors();
        Arrays.sort(divisors);
        for (final Z d : divisors) {
          Z exact = fieldRoots(p, d);
          for (final Map.Entry<Z, Z> entry : local.entrySet()) {
            if (d.mod(entry.getKey()).isZero()) {
              exact = exact.subtract(entry.getValue());
            }
          }
          if (!exact.isZero()) {
            local.put(d, exact);
          }
        }
      } else {
        final Z[] counts = primePowerOrders(p.pow(e).intValueExact());
        for (int k = 0; k < counts.length; ++k) {
          if (!counts[k].isZero()) {
            local.put(Z.valueOf(k + 1), counts[k]);
          }
        }
      }
      final Map<Z, Z> next = new HashMap<>();
      for (final Map.Entry<Z, Z> a : result.entrySet()) {
        for (final Map.Entry<Z, Z> b : local.entrySet()) {
          next.merge(a.getKey().lcm(b.getKey()), a.getValue().multiply(b.getValue()), Z::add);
        }
      }
      result = next;
    }
    return result;
  }
}
