package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031053 Position of <code>n-th 7</code> in <code>A031045</code>.
 * @author Sean A. Irvine
 */
public class A031053 extends A031045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SEVEN.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

