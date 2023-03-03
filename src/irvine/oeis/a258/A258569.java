package irvine.oeis.a258;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a036.A036967;

/**
 * A258569 Smallest prime factors of 4-full numbers.
 * @author Georg Fischer
 */
public class A258569 extends A036967 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : Jaguar.factor(super.next()).leastPrimeFactor();
  }
}
