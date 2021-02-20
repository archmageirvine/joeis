package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a040.A040025;

/**
 * A039657 Number of digits in all (2n+1)-digit palindromic primes.
 * @author Sean A. Irvine
 */
public class A039657 extends A040025 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return super.next().multiply(mN);
  }
}
