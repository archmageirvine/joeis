package irvine.oeis.a025;

import java.util.ArrayList;

import irvine.math.q.HarmonicSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025212 <code>a(n) = [ 2nd</code> elementary symmetric function of <code>{Sum{1/j, j = 1,2,...,k} ], k = 1,2,...,n</code>.
 * @author Sean A. Irvine
 */
public class A025212 extends HarmonicSequence implements Sequence {

  private final ArrayList<Q> mH = new ArrayList<>();
  {
    mH.add(null);
  }
  private int mN = 1;
  private Q mSum = Q.ZERO;

  protected Q h(final int n) {
    while (n >= mH.size()) {
      mH.add(nextQ());
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
