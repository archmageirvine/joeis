package irvine.oeis.a093;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a007.A007531;

/**
 * A093074 Greatest prime factor of n and its direct neighbors.
 * @author Georg Fischer
 */
public class A093074 extends A007531 {

  private int mN = 0;

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.TWO : Jaguar.factor(super.next()).largestPrimeFactor();
  }
}
