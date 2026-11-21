package irvine.oeis.a087;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087460 Least n such that H(n) is closer to an integer than any H(j) with j &lt; n; where H(n) is the harmonic number Sum_{i=0..n} 1/i.
 * @author Sean A. Irvine
 */
public class A087460 extends Sequence1 {

  // Only good for a few initial terms

  private final HarmonicSequence mH = new HarmonicSequence();
  private Q mBest = Q.ONE;
  private long mN = 1;
  {
    mH.nextQ(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q h = mH.nextQ();
      final Q r = h.subtract(h.round()).abs();
      if (r.compareTo(mBest) < 0) {
        mBest = r;
        return Z.valueOf(mN);
      }
    }
  }
}
