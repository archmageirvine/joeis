package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000032;

/**
 * A050116 Numbers that are the product of two distinct Lucas numbers.
 * @author Sean A. Irvine
 */
public class A050116 extends Sequence1 {

  private final MemorySequence mLucas = MemorySequence.cachedSequence(new A000032());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.NEG_ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mLucas.a(mN)) > 0) {
      final Z ln = mLucas.a(mN);
      for (int k = mN - 1; k >= 0; --k) {
        final Z prod = ln.multiply(mLucas.a(k));
        if (prod.compareTo(mPrev) <= 0) {
          break;
        }
        mA.add(prod);
      }
      ++mN;
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
