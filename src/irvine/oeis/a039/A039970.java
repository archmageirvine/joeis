package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A039970 An example of a d-perfect sequence: a(2*n) = 0, a(2*n+1) = Catalan(n) mod 3.
 * @author Sean A. Irvine
 */
public class A039970 extends A000108 {

  private boolean mIsZero = true;

  @Override
  public Z next() {
    mIsZero = !mIsZero;
    return mIsZero ? Z.ZERO : super.next().mod(Z.THREE);
  }
}

