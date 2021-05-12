package irvine.oeis.a047;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000108;

/**
 * A047075 All differences C(j)-C(i), j&gt;i, of Catalan numbers A000108.
 * @author Sean A. Irvine
 */
public class A047075 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final MemorySequence mCatalan = MemorySequence.cachedSequence(new A000108());
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mCatalan.a(mN)) >= 0) {
      for (int k = 0; k < mN; ++k) {
        mA.add(mCatalan.a(mN).subtract(mCatalan.a(k)));
      }
      ++mN;
    }
    return mA.pollFirst();
  }
}
