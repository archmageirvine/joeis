package irvine.oeis.a219;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A219554 Number of bipartite partitions of (n,n) into distinct pairs.
 * @author Sean A. Irvine
 */
public class A219554 extends Sequence0 {

  private final ArrayList<ArrayList<Z>> mF = new ArrayList<>();
  private int mN = -1;

  /*
   * Coefficient of x^i*y^j in x*d(log(F))/dx.
   */
  private static long coefficient(final int i, final int j) {
    final int g = Functions.GCD.i(i, j);
    return (long) (i / g) * Functions.SIGMA1.l(Functions.MAKE_ODD.l(g));
  }

  /*
   * Compute f(a,b), assuming all entries with a' < a are known.
   */
  private Z compute(final int a, final int b) {
    if (a == 0) {
      // F(0,y) = Product_{j>=1} (1+y^j).
      // This is the distinct-partition generating function.
      // We only use this for the newly required row-zero entries.
      final Z[] p = new Z[b + 1];
      for (int k = 0; k <= b; ++k) {
        p[k] = Z.ZERO;
      }
      p[0] = Z.ONE;
      for (int part = 1; part <= b; ++part) {
        for (int k = b; k >= part; --k) {
          p[k] = p[k].add(p[k - part]);
        }
      }
      return p[b];
    }

    Z s = Z.ZERO;
    for (int i = 1; i <= a; ++i) {
      for (int j = 0; j <= b; ++j) {
        s = s.add(mF.get(a - i).get(b - j).multiply(coefficient(i, j)));
      }
    }

    final Z[] qr = s.divideAndRemainder(Z.valueOf(a));
    assert qr[1].equals(Z.ZERO);
    return qr[0];
  }

  /**
   * Extend the square coefficient array from size n to size n+1.
   */
  private void extend(final int n) {
    // Compute the new column b=n for all old rows.
    for (int a = 0; a < n; ++a) {
      mF.get(a).add(compute(a, n));
    }
    // Compute the new row
    mF.add(new ArrayList<>());
    for (int b = 0; b <= n; ++b) {
      mF.get(n).add(compute(n, b));
    }
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      mF.add(new ArrayList<>());
      mF.get(0).add(Z.ONE);
      return Z.ONE;
    }
    extend(mN);
    return mF.get(mN).get(mN);
  }
}

