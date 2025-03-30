package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076253.
 * @author Sean A. Irvine
 */
public class A076298 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(3 * mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
