package irvine.oeis.a191;
// manually knestm/knest at 2023-03-02 15:17

import irvine.math.z.Z;
import irvine.oeis.a000.A000265;

/**
 * A191871 a(n) = numerator(n^2 / 2^n).
 * @author Georg Fischer
 */
public class A191871 extends A000265 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : super.next().square();
  }
}
