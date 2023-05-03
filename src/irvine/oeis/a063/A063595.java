package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A063595 a(n) = floor(sqrt(Fibonacci(n+1)) - sqrt(Fibonacci(n))).
 * @author Sean A. Irvine
 */
public class A063595 extends A000045 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return CR.valueOf(mA).sqrt().subtract(CR.valueOf(t).sqrt()).floor();
  }
}
