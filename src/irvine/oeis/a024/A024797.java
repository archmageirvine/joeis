package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000408;

/**
 * A024797.
 * @author Sean A. Irvine
 */
public class A024797 extends A000408 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
