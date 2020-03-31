package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a003.A003137;

/**
 * A030333 Position of <code>n-th 1</code> in <code>A003137</code>.
 * @author Sean A. Irvine
 */
public class A030333 extends A003137 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

