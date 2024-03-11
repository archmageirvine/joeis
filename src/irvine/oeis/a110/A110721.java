package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110721 Primes pertaining to A110720.
 * @author Georg Fischer
 */
public class A110721 extends A110720 {

  @Override
  public Z next() {
    super.next();
    return mZ;
  }

}