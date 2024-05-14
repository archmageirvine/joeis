package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057534 a(n+1) = a(n)/2 if 2|a(n), a(n)/3 if 3|a(n), a(n)/5 if 5|a(n), a(n)/7 if 7|a(n), a(n)/11 if 11|a(n), a(n)/13 if 13|a(n), otherwise 17*a(n)+1.
 * @author Sean A. Irvine
 */
public class A057534 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 61;
    } else if ((mN & 1) == 0) {
      mN /= 2;
    } else if (mN % 3 == 0) {
      mN /= 3;
    } else if (mN % 5 == 0) {
      mN /= 5;
    } else if (mN % 7 == 0) {
      mN /= 7;
    } else if (mN % 11 == 0) {
      mN /= 11;
    } else if (mN % 13 == 0) {
      mN /= 13;
    } else {
      mN = mN * 17 + 1;
    }
    return Z.valueOf(mN);
  }
}
