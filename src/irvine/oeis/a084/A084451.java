package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084451 Juggling states associated with the juggling sequence A084452.
 * @author Sean A. Irvine
 */
public class A084451 extends Sequence0 {

  // todo apparently this does not match Antti for larger values

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private Z mA = null;
  private int mBit = 3;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
      mSeen.set(7);
      return mA;
    }
    if (Z.SEVEN.equals(mA)) {
      // starting new block
      mA = mA.setBit(++mBit);
    } else if (mA.testBit(0)) {
      // current value is odd
      int b = 0;
      while (mA.testBit(b) || mSeen.isSet(mA.setBit(b).divide2().longValueExact())) {
        ++b;
      }
      mA = mA.setBit(b);
    }
    mA = mA.divide2();
    mSeen.set(mA.longValueExact());
    return mA;
  }
}
