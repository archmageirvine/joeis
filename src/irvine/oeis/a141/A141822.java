package irvine.oeis.a141;

import irvine.math.LongUtils;
import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A141822 Maximum term in the continued fraction of A141821(n)/n.
 * @author Sean A. Irvine
 */
public class A141822 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z minOfMax = null;
    for (long k = 1; k < mN && !Z.TWO.equals(minOfMax); ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        final Q f = new Q(k, mN);
        Z max = Z.ZERO;
        final Convergents conv = new Convergents(CR.valueOf(f));
        conv.next(); // skip a0 (it is always 0)
        while (true) {
          final Q t = conv.next();
          max = max.max(conv.frac());
          if (t.equals(f)) {
            break;
          }
        }
        if (minOfMax == null || minOfMax.compareTo(max) > 0) {
          minOfMax = max;
        }
      }
    }
    return minOfMax;
  }
}
