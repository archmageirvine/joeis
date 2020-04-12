package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031010 Position of <code>n-th 2</code> in <code>A031007</code>.
 * @author Sean A. Irvine
 */
public class A031010 extends A031007 {

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

