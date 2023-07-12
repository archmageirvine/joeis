package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a004.A004601;

/**
 * A039624 Numbers n such that there are equal numbers of 0's and 1's in first n digits of binary representation of Pi.
 * @author Sean A. Irvine
 */
public class A039624 extends A004601 {

  private long mN = 0;
  private long mBias = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mBias += 1 - super.next().longValueExact() * 2;
      if (mBias == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
