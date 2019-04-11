package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A008341 <code>a(n)=1, a(n+1) =</code> lcm(a(n),b(n)) / gcd(a(n),b(n)), where <code>{b(n)} =</code> {fibonacci(n)}.
 * @author Sean A. Irvine
 */
public class A008341 extends A000045 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z f = super.next();
    if (f.signum() > 0) {
      mA = mA.lcm(f).divide(mA.gcd(f));
    }
    return mA;
  }
}


