package irvine.oeis.a258;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a036.A036967;

/**
 * A258569 Smallest prime factors of 4-full numbers, a(1)=1.
 * @author Georg Fischer
 */
public class A258569 extends A036967 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : Functions.LPF.z(super.next());
  }
}
