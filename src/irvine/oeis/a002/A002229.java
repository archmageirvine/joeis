package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002229 Primitive roots that go with the primes in <code>A002230</code>.
 * @author Sean A. Irvine
 */
public class A002229 extends A002230 {

  @Override
  public Z next() {
    super.next();
    return mLeast;
  }
}
