package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A022300 The sequence a of 1's and 2's starting with (1, 1, 2, 1) such that a(n) is the length of the (n+2)nd run of a.
 * @author Sean A. Irvine
 */
public class A022300 extends AbstractSequence {

  /** Construct the sequence. */
  public A022300() {
    super(1);
  }

  private final LongDynamicBooleanArray mA = new LongDynamicBooleanArray();

  {
    mA.set(2);
  }

  protected long mN = -1;
  private long mS = 0;
  private long mT = 3;

  @Override
  public Z next() {
    if (++mN == mT) {
      final boolean next = !mA.isSet(mT - 1);
      final boolean b = mA.isSet(mS++);
      if (b) {
        // i.e. a "2"
        if (next) {
          mA.set(mT);
          mA.set(mT + 1);
        }
        mT += 2;
      } else {
        // i.e. a "1"
        if (next) {
          mA.set(mT);
        }
        ++mT;
      }
    }
    return mA.isSet(mN) ? Z.TWO : Z.ONE;
  }
}
