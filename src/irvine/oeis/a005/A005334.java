package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005334.
 * @author Sean A. Irvine
 */
public class A005334 extends MemoryFunction2<Integer, Z> implements Sequence {

  // todo This is not yet working.  See also discussion in blog2016.tex.
  // Have papers.
  // The values of g(i,j,m,n) are different between the formulas here and what I get from g.f. approach
  // Also, the bounds for (14) in the paper are almost certainly wrong

  static final class HFunction extends MemoryFunction2<Integer, Z> {

    private final MemoryFunction2<Integer, Z> mC;

    private HFunction(final MemoryFunction2<Integer, Z> c) {
      mC = c;
    }

    @Override
    protected Z compute(final Integer n, final Integer m) {
      if (m == 0) {
        return Z.ZERO;
      }
      Z sum = mC.get(n + 1, m);
      for (int a = 0; a <= n; ++a) {
        final Z ba = Binomial.binomial(n, a);
        for (int b = 1; b <= m; ++b) {
          if (a < n || b < m) {
            sum = sum.subtract(ba.multiply(Binomial.binomial(m - 1, b - 1)).multiply(get(a, b)).multiply(mC.get(n + 1 - a, m - b)));
          }
        }
      }
      return sum;
    }
  }

  private final MemoryFunction2<Integer, Z> mC = new A005333();
  final HFunction mH = new HFunction(mC);
  private int mN = 0;

  // todo cache these
  // G^{(i,j)}_{n,m}
  private Z g(final int i, final int j, final int n, final int m) {
    if (j > i) {
      return g(j, i, m, n);
    }
    if (n == 0 && m == 0) {
      return Z.ONE;
    }
    if (j == 0) {
      if (i == 1) {
        return mC.get(n + 1, m);
      }
      Z sum = Z.ZERO;
      for (int a = 0; a <= n; ++a) {
        final Z ba = Binomial.binomial(n, a);
        for (int b = 0; b <= m; ++b) {
          sum = sum.add(ba.multiply(Binomial.binomial(m, b)).multiply(g(i - 1, 0, a, b)).multiply(mC.get(n + 1 - a, m - b)));
        }
      }
      return sum;
    } else {
      Z sum = Z.ZERO;
      for (int a = 0; a <= n; ++a) {
        final Z ba = Binomial.binomial(n, a);
        for (int b = 0; b <= m; ++b) {
          sum = sum.add(ba.multiply(Binomial.binomial(m, b)).multiply(g(i, 0, a, b)).multiply(g(j, 0, m - b, n - a)));
        }
      }
      return sum;
    }
  }

  @Override
  protected Z compute(final Integer nn, final Integer m) {
    if (nn == 0) {
      return Z.ZERO;
    }
    final int n = nn - 1;
    Z sum = mH.get(n, m);
    for (int i = 1; i <= n; ++i) {
      final Z bi = Binomial.binomial(n, i);
      for (int j = 1; j <= m; ++j) {
        if (i < n || j < m) {
          sum = sum.subtract(bi.multiply(Binomial.binomial(m, j)).multiply(get(i + 1, j)).multiply(g(i, j, n - i, m - j)));
        }
      }
    }
    return sum;
  }


  @Override
  public Z next() {
    ++mN;
//    System.out.println("N(3,2)=" + get(3, 2) + " cf. 1");
//    System.out.println("N(3,3)=" + get(3, 3) + " cf. 34");
//    System.out.println("N(4,3)=" + get(4, 3) + " cf. 199");
//    System.out.println("N(3,4)=" + get(4, 3) + " cf. 199");
//    System.out.println("g(1,1,1,1)=" + g(1, 1, 1, 1));
//    System.out.println("g(1,0,2,3)=" + g(1, 0, 2, 3));
    return get(mN, mN);
  }
}
