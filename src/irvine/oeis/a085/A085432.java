package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085432 a(n) = number of triangles ABC with side lengths (n, m, p) such that n, m, p are integers, 1 &lt;= n &lt;= m &lt;= p, gcd(n, m, p) = 1, the Nagel point N of ABC lies on the incircle C(I, r).
 * @author Sean A. Irvine
 */
public class A085432 extends Sequence1 {

  // todo I suspect a(7)=2 in the OEIS is wrong

  private long mN = 0;

  private static boolean nagelOnIncircle(final long a, final long b, final long c) {

    final Q aq = new Q(a);
    final Q bq = new Q(b);
    final Q cq = new Q(c);

    // C = (cx, cy)
    final Q cx = bq.square().add(cq.square()).subtract(aq.square()).divide(2L * c);

    // cy^2
    final Q cy2 = bq.square().subtract(cx.square());

    final Q sum = aq.add(bq).add(cq);

    // Incenter barycentrics (a:b:c)
    final Q ix = bq.multiply(cq).add(cq.multiply(cx)).divide(sum);
    final Q iyFactor = cq.divide(sum);   // actual y-coordinate is iyFactor * cy

    final Q s = sum.divide(2);

    final Q na = s.subtract(aq);
    final Q nb = s.subtract(bq);
    final Q nc = s.subtract(cq);

    final Q nsum = na.add(nb).add(nc);

    // Nagel point Cartesian coordinates
    final Q nx = nb.multiply(cq).add(nc.multiply(cx)).divide(nsum);
    final Q nyFactor = nc.divide(nsum);  // actual y-coordinate is nyFactor * cy

    final Q dx = nx.subtract(ix);
    final Q dyFactor = nyFactor.subtract(iyFactor);

    // IN^2 = dx^2 + (dyFactor^2)*cy^2
    final Q in2 = dx.square().add(dyFactor.square().multiply(cy2));

    // r^2 = (s-a)(s-b)(s-c)/s
    final Q r2 = s.subtract(aq)
      .multiply(s.subtract(bq))
      .multiply(s.subtract(cq))
      .divide(s);

    return in2.equals(r2);
  }

  @Override
  public Z next() {
//    for (long m = 7; m < 20; ++m) {
//      for (long p = m; p < 7 + m; ++p) {
//        if (Functions.GCD.l(Functions.GCD.l(7, m), p) == 1
//          && nagelOnIncircle(7, m, p)) {
//          System.out.println("(" + 7 + "," + m + "," + p + ")");
//        }
//      }
//    }
    //    System.out.println(nagelOnIncircle(3, 4, 5));
//    System.out.println(nagelOnIncircle(2, 3, 3));
//    System.out.println(nagelOnIncircle(5, 6, 9));
//    System.out.println(nagelOnIncircle(5, 7, 8));
    if (++mN == 1) {
      return Z.ONE;
    }
    //System.out.println(nagelOnIncircle(3, 4, 5));
    long cnt = 0;

    for (long m = mN; ; ++m) {
      for (long p = m; p < mN + m; ++p) {
        if (Functions.GCD.l(Functions.GCD.l(mN, m), p) != 1) {
          continue;
        }
        if (nagelOnIncircle(mN, m, p)) {
          ++cnt;
        }
      }
      if (m > 4 * mN) { // crude cutoff for experimentation
        break;
      }
    }

    return Z.valueOf(cnt);
  }
}
