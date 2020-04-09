package irvine.oeis.a333;

import irvine.math.z.Z;
import irvine.oeis.a030.A030604;

/**
 * A333908.
 * @author Sean A. Irvine
 */
public class A333908 extends A030604 {

  private long mN = -1;

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

