package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A025142 Fixed point of the square runlength transform, with a(1) = 1 (the runlength transform of a binary sequence is the sequence of the lengths of its runs).
 * @author Sean A. Irvine
 */
public class A025142 extends Sequence1 {

  protected final LongDynamicBooleanArray mA025142 = new LongDynamicBooleanArray();
  protected final LongDynamicBooleanArray mA025143 = new LongDynamicBooleanArray();
  {
    mA025143.set(0);
  }
  private long mA = 0; // next unfilled position of A025142
  private long mB = 1; // next unfilled position of A025143
  private boolean mBit = true;
  private long mM = -1; // tracks last position expanded
  private long mN = -1; // where we are up to in generation

  protected boolean select(final long n) {
    return mA025142.isSet(n);
  }

  @Override
  public Z next() {
    if (++mN >= mA || mN >= mB) {
      // Step both sequences
      ++mM;
      mBit = !mBit; // change the "sign" for next extension
      if (mA025143.isSet(mM)) {
        if (mBit) {
          mA025142.set(mA++);
          mA025142.set(mA++);
        } else {
          mA += 2;
        }
      } else if (mBit) {
        mA025142.set(mA++);
      } else {
        ++mA;
      }
      if (mA025142.isSet(mM + 1)) {
        if (mBit) {
          mA025143.set(mB++);
          mA025143.set(mB++);
        } else {
          mB += 2;
        }
      } else if (mBit) {
        mA025143.set(mB++);
      } else {
        ++mB;
      }
    }
    return select(mN) ? Z.TWO : Z.ONE;
  }
}
