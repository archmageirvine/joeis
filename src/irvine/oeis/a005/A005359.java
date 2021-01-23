package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A005359 a(n) = n! if n is even, otherwise 0 (from Taylor series for cos x).
 * @author Sean A. Irvine
 */
public class A005359 extends A000142 {

  private boolean mRetain = false;

  @Override
  public Z next() {
    mRetain = !mRetain;
    final Z t = super.next();
    return mRetain ? t : Z.ZERO;
  }
}
