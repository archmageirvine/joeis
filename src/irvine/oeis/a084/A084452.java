package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A084452 An infinite juggling sequence with three balls: a(n) is zero when A084451(n-1) is even, otherwise the least (lowest) throw such that the resulting next juggling state A084451(n) does not occur in A084451[0..n-1].
 * @author Sean A. Irvine
 */
public class A084452 extends Sequence0 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private Z mA = Z.SEVEN;
  {
    mSeen.set(7);
  }
  private int mBit = 3;

  @Override
  public Z next() {
    long res = 0;
    if (Z.SEVEN.equals(mA)) {
      // starting new block
      mA = mA.setBit(++mBit);
      res = mBit;
    } else if (mA.testBit(0)) {
      // current value is odd
      int b = 0;
      while (mA.testBit(b) || mSeen.isSet(mA.setBit(b).divide2().longValueExact())) {
        ++b;
      }
      mA = mA.setBit(b);
      res = b;
    }
    mA = mA.divide2();
    mSeen.set(mA.longValueExact());
    return Z.valueOf(res);
  }
}
