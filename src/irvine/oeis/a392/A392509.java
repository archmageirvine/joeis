package irvine.oeis.a392;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A392509 Triangle of coefficients of the permanent polynomial of rectangular Dancing School matrices.
 * @author Sean A. Irvine
 */
public class A392509 extends Sequence1 {

  // After Jaap Spies

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mRow = RING.zero();

  private Z[] row(final int m) {
    // Computes the coefficient row for dimension m using Stirling-Glue algorithm
    // Returns coefficients for h^m down to h^0
    final Z[] total = new Z[m + 1];
    Arrays.fill(total, Z.ZERO);
    // Iterate target number of rooks in Right Corner (nR)
    for (int nR = 0; nR < m; ++nR) {
      HashMap<Point, Z> dp = new HashMap<>();
      dp.put(new Point(0, 0), Z.ONE);
      for (int i = 0; i < m; ++i) {
        final HashMap<Point, Z> newDp = new HashMap<>();
        for (final Map.Entry<Point, Z> e : dp.entrySet()) {
          final Point k = e.getKey();
          final int kL = k.left();
          final int kR = k.right();
          final Z ways = e.getValue();
          // 1. Skip row
          newDp.merge(k, ways, Z::add);
          // Place in Left (L) - Stirling structure
          if (i >= 1) {
            final int factorL = i - kL;
            if (factorL > 0) {
              newDp.merge(new Point(kL + 1, kR), ways.multiply(factorL), Z::add);
            }
          }
          // 3. Place in Right (R) - Stirling structure
          if (i <= m - 2 && kR < nR) {
            final int factorR = (m - 1 - i) - (nR - 1 - kR);
            if (factorR > 0) {
              newDp.merge(new Point(kL, kR + 1), ways.multiply(factorR), Z::add);
            }
          }
        }
        dp = newDp;
      }
      for (final Map.Entry<Point, Z> e : dp.entrySet()) {
        if (e.getKey().right() == nR) {
          final int k = e.getKey().left() + e.getKey().right();
          total[k] = total[k].add(e.getValue());
        }
      }
    }
    return total;
  }

  private Polynomial<Z> fallingFactorial(final int t, final int n) {
    Polynomial<Z> f = RING.one();
    for (int k = 1; k <= n; ++k) {
      f = RING.multiply(f, Polynomial.create(t - k + 1, 1));
    }
    return f;
  }

  private Polynomial<Z> step(final int n) {
    // f(m, h) = sum_{k=0}^m (-1)^k * total_rv[k] * falling_factorial(m+h-k, m-k)
    final Z[] total = row(n);
    //System.out.println(Arrays.toString(total));
    Polynomial<Z> f = RING.zero();
    for (int k = 0; k <= n; ++k) {
      final Polynomial<Z> t = RING.multiply(fallingFactorial(n - k, n - k), Z.NEG_ONE.pow(k).multiply(total[k]));
      f = RING.add(f, t);
    }
    return f;
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mRow = step(++mN);
      mM = 0;
    }
    return mRow.coeff(mRow.degree() - mM);
  }
}
