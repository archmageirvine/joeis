package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a080.A080843;

/**
 * A003144.
 * @author Sean A. Irvine
 */
public class A003144 extends A080843 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }

}
