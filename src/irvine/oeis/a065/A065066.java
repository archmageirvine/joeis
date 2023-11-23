package irvine.oeis.a065;

import java.util.concurrent.atomic.AtomicLong;

import irvine.math.graph.Graph;
import irvine.math.z.Z;
import irvine.oeis.PosetsSequence;
import irvine.oeis.Sequence0;

/**
 * A000112.
 * @author Sean A. Irvine
 */
public class A065066 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private AtomicLong[] mCounts = null; // because of parallelism in generation

  private boolean count(final Graph poset) {
    int c = 0;
    for (int u = 0; u < poset.order(); ++u) {
      if (poset.inDegree(u) == 0) {
        ++c;
      }
    }
    mCounts[c].incrementAndGet();
    return false;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mCounts = new AtomicLong[++mN + 1];
      for (int k = 0; k < mCounts.length; ++k) {
        mCounts[k] = new AtomicLong();
      }
      mM = 0;
      new PosetsSequence(mN, this::count).next();
    }
    return Z.valueOf(mCounts[mM].get());
  }
}
