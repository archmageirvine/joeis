package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a006.A006879;

/**
 * A046719 Total number of digits in all primes with n digits.
 * @author Sean A. Irvine
 */
public class A046719 extends A006879 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
