package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084451 Juggling states associated with the juggling sequence A084452.
 * @author Sean A. Irvine
 */
public class A084451 extends Sequence0 {

  private final HashSet<Long> mSeen = new HashSet<>();
  private Z mA = null;
  private int mBit = 3;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
      mSeen.add(7L);
      return mA;
    }
    if (Z.SEVEN.equals(mA)) {
      // starting new block
      while (mSeen.contains(mA.setBit(mBit).divide2().longValueExact())) {
        ++mBit;
      }
      mA = mA.setBit(mBit);
    } else if (mA.testBit(0)) {
      // current value is odd
      int b = 0;
      while (mA.testBit(b) || mSeen.contains(mA.setBit(b).divide2().longValueExact())) {
        ++b;
      }
      mA = mA.setBit(b);
    }
    mA = mA.divide2();
    mSeen.add(mA.longValueExact());
    return mA;
  }
}
