package irvine.oeis.a253;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.a254.A254046;

/**
 * A253786 a(3n) = 0, a(3n+1) = 0, a(3n+2) = 1 + a(n+1).
 * @author Georg Fischer
 */
public class A253786 extends A254046 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : super.next().subtract(1);
  }
}
