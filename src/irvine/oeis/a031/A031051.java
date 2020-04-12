package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031051 Position of <code>n-th 5</code> in <code>A031045</code>.
 * @author Sean A. Irvine
 */
public class A031051 extends A031045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FIVE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

