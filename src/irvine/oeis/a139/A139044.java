package irvine.oeis.a139;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a060.A060383;

/**
 * A139044 Smallest prime divisor of the Fibonacci numbers &gt; 1.
 * @author Georg Fischer
 */
public class A139044 extends A060383 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).leastPrimeFactor();
  }
}
