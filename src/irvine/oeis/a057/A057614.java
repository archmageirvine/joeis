package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057614 a(n+1) = a(n)/2 if 2|a(n), a(n)/3 if 3|a(n), a(n)/5 if 5|a(n), a(n)/7 if 7|a(n), otherwise 11*a(n)+1.
 * @author Sean A. Irvine
 */
public class A057614 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 17;
    } else if ((mN & 1) == 0) {
      mN /= 2;
    } else if (mN % 3 == 0) {
      mN /= 3;
    } else if (mN % 5 == 0) {
      mN /= 5;
    } else if (mN % 7 == 0) {
      mN /= 7;
    } else {
      mN = mN * 11 + 1;
    }
    return Z.valueOf(mN);
  }
}
