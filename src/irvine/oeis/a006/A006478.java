package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006478 <code>a(n) = a(n-1) + a(n-2) + F(n) - 1, a(0) = a(1) = 0</code>, where <code>F() =</code> Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A006478 extends A000045 {

  private Z mA = super.next();
  private Z mB = super.next().subtract(1);

  {
    next();
  }

  @Override
  public Z next() {
    final Z t = mB.add(mA).add(super.next()).subtract(1);
    mA = mB;
    mB = t;
    return mB;
  }
}
