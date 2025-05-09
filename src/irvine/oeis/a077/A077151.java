package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A077151 Index of the first occurrence of n in A077150, or 0 if n does not occur.
 * @author Sean A. Irvine
 */
public class A077151 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mSeq = new A077150();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0 && (mN + 1) * mN + 1 >= mM) {
      ++mM;
      final long cnt = mSeq.next().longValueExact();
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

