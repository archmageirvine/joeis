package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039973 An example of a d-perfect sequence: a(2*n) = 0, a(2*n-1) = A039965(n).
 * @author Sean A. Irvine
 */
public class A039973 extends A039965 {

  private boolean mIsZero = true;

  @Override
  public Z next() {
    mIsZero = !mIsZero;
    return mIsZero ? Z.ZERO : super.next();
  }
}

