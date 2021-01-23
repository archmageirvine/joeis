package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003137;

/**
 * A030334 Position of n-th 2 in A003137.
 * @author Sean A. Irvine
 */
public class A030334 extends A003137 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

