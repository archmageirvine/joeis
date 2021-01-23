package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007932 Numbers that contain only 1's, 2's and 3's.
 * @author Sean A. Irvine
 */
public class A007932 implements Sequence {

  private long mN = 2;
  private long mLimit = 6;

  @Override
  public Z next() {
    if (++mN == mLimit) {
      mLimit *= 3;
      mN = mLimit / 2;
    }
    return new Z(Long.toString(mN, 3).substring(1).replace('2', '3').replace('1', '2').replace('0', '1'));
  }
}
