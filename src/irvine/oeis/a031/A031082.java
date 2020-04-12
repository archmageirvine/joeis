package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031082 Position of <code>n-th 5</code> in <code>A031076</code>.
 * @author Sean A. Irvine
 */
public class A031082 extends A031076 {

  private long mN = 0;

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

