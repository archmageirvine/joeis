package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A014976 Successive locations of zeros in decimal expansion of Pi (where locations 1, 2, 3, ... correspond to digits 3, 1, 4, ...).
 * @author Sean A. Irvine
 */
public class A014976 extends A000796 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
