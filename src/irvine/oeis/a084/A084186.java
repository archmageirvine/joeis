package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004539;
import irvine.util.array.DynamicLongArray;

/**
 * A084186 First occurrence of exactly n 1's in the binary expansion of sqrt(2).
 * @author Sean A. Irvine
 */
public class A084186 extends AbstractSequence {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Sequence mSeq;
  private int mN = 0;
  private long mM = 0;

  protected A084186(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A084186() {
    this(1, new A004539());
  }

  private Z step() {
    ++mM;
    return mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      while (step().isZero()) {
        // do nothing
      }
      int cnt = 1;
      while (step().isOne()) {
        ++cnt;
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM - cnt);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

