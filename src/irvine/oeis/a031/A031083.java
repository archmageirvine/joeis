package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031083 Position of <code>n-th 6</code> in <code>A031076</code>.
 * @author Sean A. Irvine
 */
public class A031083 extends A031076 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

