package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039993 Number of different primes embedded in n.
 * @author Sean A. Irvine
 */
public class A039993 extends A039992 {

  private long mN = 0;

  @Override
  public Z next() {
    return count(Z.valueOf(++mN));
  }
}

