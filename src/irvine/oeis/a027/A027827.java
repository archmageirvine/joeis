package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A027827 Values of n for which 11 divides <code>A000041(n)</code>.
 * @author Sean A. Irvine
 */
public class A027827 extends A000041 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(11) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
