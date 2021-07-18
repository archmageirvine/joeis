package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049066 Mean prime gaps associated with A049036.
 * @author Sean A. Irvine
 */
public class A049066 extends A000040 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.subtract(2).mod(++mN) == 0) {
        return p.subtract(2).divide(mN).subtract(1);
      }
    }
  }
}
