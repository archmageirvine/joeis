package irvine.oeis.a090;

import irvine.math.z.Z;

/**
 * A090509 Primes arising in A090508.
 * @author Sean A. Irvine
 */
public class A090509 extends A090508 {

  @Override
  public Z next() {
    super.next();
    return new Z(mConc);
  }
}
