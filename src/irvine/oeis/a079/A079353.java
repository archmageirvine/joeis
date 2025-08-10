package irvine.oeis.a079;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079216.
 * @author Sean A. Irvine
 */
public class A079353 extends Sequence1 {

  private final HarmonicSequence mH = new HarmonicSequence();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final List<Z> conv = ContinuedFractionUtils.continuedFraction(mH.nextQ());
      Z h0 = Z.ZERO;
      Z h1 = Z.ONE;
      Z k0 = Z.ONE;
      Z k1 = Z.ZERO;
      Q res = null;
      for (final Z a : conv) {
        final Z h = a.multiply(h1).add(h0);
        final Z k = a.multiply(k1).add(k0);
        h0 = h1;
        h1 = h;
        k0 = k1;
        k1 = k;
        final Q c = new Q(h, k);
        if (c.den().compareTo(mN) <= 0) {
          res = c;
        }
      }
      if (res != null && res.isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
