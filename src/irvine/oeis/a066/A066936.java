package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066838.
 * @author Sean A. Irvine
 */
public class A066936 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().subtract(1).mod(Euler.phi(++mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
