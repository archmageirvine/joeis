package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031103 Position of <code>n-th 2</code> in <code>A031100</code>.
 * @author Sean A. Irvine
 */
public class A031103 extends A031100 {

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

