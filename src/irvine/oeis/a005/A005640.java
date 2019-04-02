package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005640 Number of phylogenetic trees with n labels.
 * @author Sean A. Irvine
 */
public class A005640 extends MemoryFunction1<Z> implements Sequence {

  // This could be made faster by caching results

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  private int mN = -2;

  static Z r(final int n, final int[] cntForm) {
    Z res = FACTORIAL.factorial(n);
    for (int k = 1; k < cntForm.length; ++k) {
      final int v = cntForm[k];
      if (v > 0) {
        res = res.divide(FACTORIAL.factorial(v));
        res = res.divide(FACTORIAL.factorial(k).pow(v));
      }
    }
    return res;
  }

  protected int operations() {
    return 3; // A, O, N
  }

  protected Z switchA(final int k, final int n) {
    switch (k) {
      case 0:
        return o(n);
      case 1:
        return n(n);
      default:
        throw new RuntimeException();
    }
  }

  protected Z switchM(final int k, final int n) {
    throw new RuntimeException();
  }

  protected int numParts(final int[] c) {
    int parts = 0;
    for (final int v : c) {
      parts += v;
    }
    return parts;
  }

  private Z a(final int n, final int[] c) {
    if (c[n] == 1) {
      return Z.ZERO; // Eqn (14)
    }
    if (c[1] == n) {
      return Z.ONE.shiftLeft(n); // Eqn (15)
    }
    Z t = Z.ZERO;
    // We need to choose from the non-A operations
    final long ops = operations() - 1;
    final long limit = Z.valueOf(ops).pow(numParts(c)).longValueExact();
    for (long choices = 0; choices < limit; ++choices) {
      // For a given choice for the product Y^{1}(n_1) ... Y^{p}(n_p)
      Z product = Z.ONE;
      long q = choices;
      outer:
      for (int k = 1; k < c.length; ++k) {
        int v = c[k];
        while (v-- > 0) {
          product = product.multiply(switchA((int) (q % ops), k));
          if (Z.ZERO.equals(product)) { // Efficiency
            break outer;
          }
          q /= ops;
        }
      }
      assert q == 0 || Z.ZERO.equals(product);
      t = t.add(product);
    }
    return t.multiply(r(n, c));
  }

  // Actual computation of a(n) if not already computed
  @Override
  protected Z compute(final int n) {
    if (n <= 1) {
      return Z.ZERO; // Eqn(14)
    }
    // Eqn(9), (11)
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    final int[] c = new int[n + 1];
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      sum = sum.add(a(n, c));
    }
    return sum;
  }

  // Included here because needed in multiple subclasses
  private class MFunction extends MemoryFunction1<Z> {

    private Z m(final int n, final int[] c) {
      final int numParts = numParts(c);
      if (numParts != 3) {
        return Z.ZERO; // Eqn (19)
      }
      if (c[1] == n) {
        return Z.ONE.shiftLeft(n); // Eqn (15)
      }
      Z t = Z.ZERO;
      final long ops = operations();
      final long limit = Z.valueOf(ops).pow(numParts(c)).longValueExact();
      for (long choices = 0; choices < limit; ++choices) {
        // For a given choice for the product Y^{1}(n_1) ... Y^{p}(n_p)
        Z product = Z.ONE;
        long q = choices;
        outer:
        for (int k = 1; k < c.length; ++k) {
          int v = c[k];
          while (v-- > 0) {
            product = product.multiply(switchM((int) (q % ops), k));
            if (Z.ZERO.equals(product)) { // Efficiency
              break outer;
            }
            q /= ops;
          }
        }
        assert q == 0 || Z.ZERO.equals(product);
        t = t.add(product);
      }
      return t.multiply(r(n, c));
    }

    @Override
    protected Z compute(final int n) {
      if (n <= 1) {
        return Z.ZERO; // Eqn(14)
      }
      // Eqn (9), (13)
      final IntegerPartition part = new IntegerPartition(n);
      int[] p;
      final int[] c = new int[n + 1];
      Z sum = Z.ZERO;
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, c);
        sum = sum.add(m(n, c));
      }
      return sum;
    }
  }

  private final MFunction mM = new MFunction();

  Z m(final int n) {
    return mM.get(n);
  }

  Z a(final int n) {
    return get(n); // Cache or compute value
  }

  Z o(final int n) {
    return a(n); // Eqn(16), duality, retained for compatability with description in paper
  }

  Z n(final int n) {
    return n == 1 ? Z.TWO : Z.ZERO; // Eqn(18) and (14)
  }

  @Override
  public Z next() {
    return ++mN < 1 ? Z.ONE : a(mN).multiply2().add(n(mN));
  }

}

