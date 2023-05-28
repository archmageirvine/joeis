package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A063938 Numbers k that divide tau(k), where tau(k)=A000594(k) is Ramanujan's tau function.
 * @author Sean A. Irvine
 */
public class A063938 extends A000594 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
