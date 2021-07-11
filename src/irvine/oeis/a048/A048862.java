package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000849;

/**
 * A048862 Number of primes in the reduced residue system of n-th primorial number (=A002110(n)).
 * @author Sean A. Irvine
 */
public class A048862 extends A000849 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
