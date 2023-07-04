package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.Sequence0;

/**
 * A016043 2^(2^n) +- 1 without repeats.
 * @author Sean A. Irvine
 */
public class A016043 extends RecordSequence {

  /** Construct the sequence. */
  public A016043() {
    super(new Sequence0() {

      private long mDelta = 1;
      private int mN = -1;

      @Override
      public Z next() {
        mDelta = -mDelta;
        if (mDelta < 0) {
          ++mN;
        }
        return Z.ONE.shiftLeft(1 << mN).add(mDelta);
      }
    });
  }
}
