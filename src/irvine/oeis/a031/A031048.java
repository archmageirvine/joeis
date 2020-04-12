package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031048 Position of <code>n-th 2</code> in <code>A031045</code>.
 * @author Sean A. Irvine
 */
public class A031048 extends A031045 {

  private long mN = -1;

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

