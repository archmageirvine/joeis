package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A367005 a(n) is the largest prime factor of n*2^n+1 for n&gt;0, and a(0)=1.
 * @author Sean A. Irvine
 */
public class A367005 extends A002064 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).largestPrimeFactor();
  }
}
