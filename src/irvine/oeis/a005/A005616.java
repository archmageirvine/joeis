package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * A005616 Number of disjunctively-realizable functions of n variables.
 * @author Sean A. Irvine
 */
public class A005616 extends A005640 {

  private int mN = -1;

  @Override
  protected Z switchA(final int k, final int n) {
    switch (k) {
      case 0:
        return o(n);
      case 1:
        return n(n);
      case 2:
        return e(n);
      default:
        throw new RuntimeException();
    }
  }

  protected Z switchE(final int k, final int n) {
    switch (k) {
      case 0:
        return o(n);
      case 1:
        return n(n);
      case 2:
        return a(n);
      default:
        throw new RuntimeException();
    }
  }

  @Override
  protected int operations() {
    return 4; // A, E, O, N
  }

  private class EFunction extends MemoryFunction1<Z> {

    private Z e(final int n, final int[] c) {
      if (c[1] == n) {
        return Z.TWO; // Eqn (15)
      }
      if (c[n] == 1) {
        return Z.ZERO; // SAI ???
      }
      Z t = Z.ZERO;
      final long ops = operations() - 1;
      final int numParts = numParts(c);
      final long limit = Z.valueOf(ops).pow(numParts).longValueExact();
      for (long choices = 0; choices < limit; ++choices) {
        // For a given choice for the product Y^1(n_1) ... Y^p(n_p)
        Z product = Z.ONE;
        long q = choices;
        outer:
        for (int k = 1; k < c.length; ++k) {
          int v = c[k];
          while (v-- > 0) {
            product = product.multiply(switchE((int) (q % ops), k));
            if (product.isZero()) { // Efficiency
              break outer;
            }
            q /= ops;
          }
        }
        assert q == 0 || product.isZero();
        t = t.add(product);
      }
      return t.multiply(r(n, c)).shiftRight(numParts - 1);
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
        sum = sum.add(e(n, c));
      }
      return sum;
    }
  }

  private final EFunction mE = new EFunction();

  Z e(final int n) {
    return mE.get(n);
  }

  @Override
  public Z next() {
    return ++mN == 0 ? Z.TWO : a(mN).multiply2().add(e(mN)).add(n(mN));
  }

}

