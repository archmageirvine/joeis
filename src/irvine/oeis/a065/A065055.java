package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A065055 Number of subtraction steps in n-th interval between special points in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A065055 extends Sequence1 {

  private static class RecamanSequence extends Sequence0 {
    // Differs from A005132 in that it keeps track of number of subtractive steps
    private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
    private long mPrev = 0;
    private long mN = -1;
    private long mSubtractive = 0;

    @Override
    public Z next() {
      final long t = mPrev - ++mN;
      final long u;
      if (t > 0 && !mSeen.isSet(t)) {
        u = t;
        ++mSubtractive;
      } else {
        u = mPrev + mN;
      }
      mSeen.set(u);
      mPrev = u;
      return Z.valueOf(u);
    }
  }

  private final RecamanSequence mRecaman = new RecamanSequence();
  private Z mR = Z.NEG_ONE;
  private Z mN = Z.ZERO;
  {
    next();
  }

  @Override
  public Z next() {
    final long subtractive = mRecaman.mSubtractive;
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      final Z old = mR;
      mR = mRecaman.next().mod(mN);
      if (old.multiply(mN).compareTo(mR.multiply(t)) < 0) {
        return Z.valueOf(mRecaman.mSubtractive - subtractive);
      }
    }
  }
}

