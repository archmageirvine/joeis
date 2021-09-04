package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051233.
 * @author Sean A. Irvine
 */
public class A051233 implements Sequence {

  // This sequence is very similar to A124623, but could potentially be different.

  // Computation strategy: first split on n = even or odd.

  // For odd n, the origin of the circle is in the middle of a square.  This
  // square contributes 1 to the total. For the remainder we compute, in turn,
  // the contribution from [x-1/2,x+1/2], but also restricted to the octant
  // 0 <= x <= y.  The lines x=0 and x=y have multiplicity 4 and everything else
  // has multiplicity 8.  The difficulty is making a decision for the "top"
  // square in each of these columns.  Usually this can be done by checking if
  // the mid-point of the square is inside the circle, but in some cases are
  // more careful integration is needed to check the bounded area.
  //
  // The even case is similar, but the original is at the corner of a cell.

  private long mN = 0;

  private CR f(final CR r, final CR x) {
    return r.multiply(r).subtract(x.multiply(x)).sqrt();
  }

  private CR l(final CR r, final long x) {
    return f(r, CR.valueOf(x).subtract(CR.HALF));
  }

  private CR r(final CR r, final long x) {
    return f(r, CR.valueOf(x).add(CR.HALF));
  }

  private Z computeOdd(final long n) {
    assert (n & 1) == 1;
    final CR r = CR.valueOf(n).divide(CR.TWO);
    Z cnt = Z.ONE; // origin
    // Handle line x = 0
    cnt = cnt.add((n - 1) * 2); // i.e., 4 * (n-1) / 2.
    // Handle line x = y, contribution is 4 * floor(r/sqrt(2)-1/2)
    final long m = r.divide(CR.SQRT2).subtract(CR.HALF).round().longValueExact();
    cnt = cnt.add(4 * m);
    //System.out.println("n=" + n + " m=" + m + " cnt=" + cnt);
    // Handle remaining strips (each with multiplicity 8)
    for (long x = 1; x <= m; ++x) {
      final CR leftY = l(r, x);
      final CR rightY = r(r, x);
      final long h;
      if (leftY.floor().equals(rightY.floor())) {
        // This is potentially a tricky case, we compute the integral
        // I(r,x) = int_{x-1/2}^{x+1/2} sqrt(r^2-t^2) dt - 1/2
        // with the last -1/2 for the half cell at y=0.
        // We look at frac{I} to decide if more than 50% is included.
        // We can do this with round() as in the usual case.
        final CR sp = ComputableReals.SINGLETON.asin(CR.valueOf(new Q(2 * x + 1, n)));
        final CR sm = ComputableReals.SINGLETON.asin(CR.valueOf(new Q(2 * x - 1, n)));
        final CR a = sp.subtract(sm).multiply(n * n);
        final long p = (n - 1) / 2;
        final long o = p * (p + 1);
        final CR b = CR.valueOf(o + x - x * x).sqrt().multiply(2 - 4 * x);
        final CR c = CR.valueOf(o - x - x * x).sqrt().multiply(2 + 4 * x);
        final CR d = a.add(b).add(c).divide(CR.EIGHT);
        //System.out.println("n=" + n + " x=" + x + " d=" + d + " o=" + o);
        h = d.subtract(CR.HALF).round().longValueExact();
      } else {
        h = f(r, CR.valueOf(x)).subtract(CR.HALF).round().longValueExact();
      }
      cnt = cnt.add((h - x) * 8);
      //System.out.println("n=" + n + " x=" + x + " -> h=" + h + " cnt is now " + cnt);
    }
    return cnt;
  }

  private Z computeEven(final long n) {
    assert (n & 1) == 0;
    final CR r = CR.valueOf(n).divide(CR.TWO);
    Z cnt = Z.ZERO;
    // Handle line x = 0
    cnt = cnt.add(n * 2 + (n - 2) * 2); // i.e., 4 * n / 2.
    //System.out.println("n=" + n + " cnt=" + cnt);
    // Handle line x = y, contribution is 4 * floor(r/sqrt(2)-1)
    final long m = r.divide(CR.SQRT2).round().longValueExact();
    cnt = cnt.add(4 * (m - 1)); // x=[0..1] already counted
    //System.out.println("n=" + n + " m=" + m + " cnt=" + cnt);
    // Handle remaining strips (each with multiplicity 8)
    for (long x = 1; x < m; ++x) {
      final CR leftY = f(r, CR.valueOf(x));
      final CR rightY = f(r, CR.valueOf(x + 1));
      final long h;
      if (leftY.floor().equals(rightY.floor())) {
        final CR sp = ComputableReals.SINGLETON.asin(CR.valueOf(new Q(2 * x + 2, n)));
        final CR sm = ComputableReals.SINGLETON.asin(CR.valueOf(new Q(2 * x, n)));
        final CR a = sp.subtract(sm).multiply(n * n);
        final long e = ((n / 2) - 1) * ((n / 2) + 1);
        final CR b = CR.valueOf(e - 2 * x - x * x).sqrt().multiply(4 + 4 * x);
        final CR c = CR.valueOf(e + 1 - x * x).sqrt().multiply(4 * x);
        final CR d = a.add(b).subtract(c).divide(CR.EIGHT);
        //System.out.println("n=" + n + " x=" + x + " d=" + d + " e=" + e);
        h = d.round().longValueExact();
      } else {
        h = f(r, CR.valueOf(x).add(CR.HALF)).round().longValueExact();
      }
      cnt = cnt.add((h - x - 1) * 8);
      //System.out.println("n=" + n + " x=" + x + " -> h=" + h + " cnt is now " + cnt);
    }
    return cnt;
  }

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? computeEven(mN) : computeOdd(mN);
  }
}
