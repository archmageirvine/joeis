package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046972 Primes arising in A046966.
 * @author Sean A. Irvine
 */
public class A046972 extends A046966 {

  @Override
  public Z next() {
    super.next();
    return mProd.add(1);
  }
}
