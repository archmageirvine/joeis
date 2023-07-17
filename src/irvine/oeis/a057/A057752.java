package irvine.oeis.a057;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a006.A006880;

/**
 * A057752 Difference between nearest integer to Li(10^n) and pi(10^n), where Li(x) = integral of log(x) and pi(10^n) = number of primes &lt;= 10^n (A006880).
 * @author Sean A. Irvine
 */
public class A057752 extends A006880 {

  /** Construct the sequence. */
  public A057752() {
    super(1);
  }

  private Z mA = Z.ONE;

  {
    super.next();
  }

  @Override
  public Z next() {
    mA = mA.multiply(10);
    return CR.valueOf(mA).li().subtract(CR.valueOf(super.next())).round();
  }
}
