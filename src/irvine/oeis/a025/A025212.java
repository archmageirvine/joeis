package irvine.oeis.a025;

import java.util.ArrayList;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A025212 a(n) = floor(2nd elementary symmetric function of Sum_{j=1..k} 1/j, k = 1,2,...,n).
 * @author Sean A. Irvine
 */
public class A025212 extends Sequence2 {

  private final HarmonicSequence mHSeq = new HarmonicSequence();
  private final ArrayList<Q> mH = new ArrayList<>();
  {
    mH.add(null);
  }
  private int mN = 1;
  private Q mSum = Q.ZERO;

  protected Q h(final int n) {
    while (n >= mH.size()) {
      mH.add(mHSeq.nextQ());
    }
    return mH.get(n);
  }

  @Override
  public Z next() {
    final Q sk = h(++mN);
    for (int j = 1; j < mN; ++j) {
      mSum = mSum.add(sk.multiply(h(j)));
    }
    return mSum.floor();
  }
}
