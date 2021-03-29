package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A084544 Alternate number system in base 4.
 * @author Sean A. Irvine
 */
public class A084544 implements Sequence {

  private long mN = 3;
  private long mLimit = 8;

  @Override
  public Z next() {
    if (++mN == mLimit) {
      mLimit *= 4;
      mN = mLimit / 2;
    }
    return new Z(Long.toString(mN, 4).substring(1).replace('3', '4').replace('2', '3').replace('1', '2').replace('0', '1'));
  }
}
