package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006889 Exponent of least power of 2 having n consecutive 0's in its decimal representation.
 * @author Sean A. Irvine
 */
public class A006889 implements Sequence {

  // This is pretty naive and will run out of space in computing later terms

  private long mPower = -1;
  private Z mN = Z.ONE;
  private String mZeros = "";

  @Override
  public Z next() {
    if (mPower == -1) {
      ++mPower;
      return Z.ZERO;
    }
    mZeros = mZeros + "0";
    while (true) {
      mN = mN.multiply2();
      ++mPower;
      if (mN.toString().contains(mZeros)) {
        return Z.valueOf(mPower);
      }
    }
  }
}
