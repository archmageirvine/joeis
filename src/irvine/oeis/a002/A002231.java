package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a029.A029932;

/**
 * A002231 Primitive roots that go with the primes in A029932.
 * @author Sean A. Irvine
 */
public class A002231 extends A029932 {

  @Override
  public Z next() {
    super.next();
    return mLeast;
  }
}
