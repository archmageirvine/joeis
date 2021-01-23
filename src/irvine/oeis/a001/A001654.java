package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A001654 Golden rectangle numbers: F(n)*F(n+1), where F(n) = A000045(n) (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A001654 extends A000045 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.multiply(mPrev);
    mPrev = t;
    return r;
  }
}
