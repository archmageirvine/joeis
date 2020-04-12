package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031033 Position of <code>n-th 5</code> in <code>A031027</code>.
 * @author Sean A. Irvine
 */
public class A031033 extends A031027 {

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

