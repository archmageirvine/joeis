package irvine.oeis.a107;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000931;

/**
 * A107797 a(n) = phi(Padovan(n+4)).
 * @author Georg Fischer
 */
public class A107797 extends A000931 {

  private int mN = -1;

  {
    for (int i = 0; i < 5; ++i) {
      super.next();
    }
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : Euler.phi(super.next());
  }
}
