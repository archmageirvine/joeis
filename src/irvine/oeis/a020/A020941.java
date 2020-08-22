package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A020941 Main diagonal of Wythoff array: w(n,n)=[ n*tau ]F(n+1)+(n-1)F(n), where tau=(1+sqrt(5))/2, F(n) = Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A020941 extends A000045 {

  {
    super.next(); // skip 0
  }
  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    final Z s = mA.multiply(mN);
    mA = super.next();
    return s.add(CR.PHI.multiply(++mN).floor().multiply(mA));
  }
}
