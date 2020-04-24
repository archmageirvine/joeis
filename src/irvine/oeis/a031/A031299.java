package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031299 Position of <code>n-th 0</code> in <code>A031298</code>.
 * @author Sean A. Irvine
 */
public class A031299 extends A031298 {

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

