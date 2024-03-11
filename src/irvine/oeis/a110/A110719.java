package irvine.oeis.a110;

import irvine.math.z.Z;

/**
 * A110719 Primes pertaining to A110718.
 * @author Georg Fischer
 */
public class A110719 extends A110718 {

  @Override
  public Z next() {
    super.next();
    return mZ;
  }
}
