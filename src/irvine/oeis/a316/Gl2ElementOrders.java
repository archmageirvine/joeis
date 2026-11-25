package irvine.oeis.a316;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Element order distributions in GL(2,Z_n).
 * @author Gregory Morse
 */
final class Gl2ElementOrders {

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
    return mPrimePowers.computeIfAbsent(modulus, n -> new A316566().computeRow(n));
  }

  Z roots(final int modulus, final Z k) {
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

  Map<Z, Z> distribution(final int modulus) {
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
