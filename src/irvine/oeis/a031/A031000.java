package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a030.A030998;

/**
 * A031000 Position of <code>n-th 1</code> in <code>A030998</code>.
 * @author Sean A. Irvine
 */
public class A031000 extends A030998 {

  private long mN = -1;

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

