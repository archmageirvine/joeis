package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053431 Numbers k such that (Pi/2)*k^2*sin(1/k) &lt; floor(Pi*k/2).
 * @author Sean A. Irvine
 */
public class A053431 extends Sequence1 {

  private long mN = 0;
  private final Convergents mConvergents = new Convergents(CR.HALF_PI);
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mN += 2;
      final Q convEven = mConvergents.next(); // even n
      final Q convOdd = mConvergents.next(); // odd n
      if (mN > 4) {
        final Z p = convEven.num();
        final Z q = convEven.den();
        final CR lo = CR.valueOf(new Q(Z.ONE, q.add(convOdd.den())));
        final CR error = CR.HALF_PI.multiply(CR.valueOf(new Q(Z.ONE, q.multiply(6))).add(CR.valueOf(new Q(Z.ONE, q.pow(3).multiply(30)))));
        if (lo.compareTo(error) < 0) {
          long k = 0;
          while (true) {
            final Z b = q.multiply(++k);
            final Z c = p.multiply(k);
            final CR t = CR.valueOf(new Q(Z.ONE, b.square().multiply(6))).add(CR.valueOf(new Q(Z.ONE, b.pow(4).multiply(30))));
            final CR mid = CR.HALF_PI.multiply(t);
            if (mid.compareTo(CR.valueOf(new Q(Z.ONE, b.square().multiply2()))) >= 0) {
              break;
            }
            final CR d = CR.valueOf(new Q(c, b)).multiply(t);
            if (d.compareTo(mid) >= 0) {
              break;
            }
            final CR e = CR.HALF_PI.subtract(CR.valueOf(new Q(c, b)));
            if (e.compareTo(d) > 0) {
              break;
            }
            mA.add(b);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
