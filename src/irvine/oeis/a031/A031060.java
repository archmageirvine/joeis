package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031060 Position of <code>n-th 2</code> in <code>A031057</code>.
 * @author Sean A. Irvine
 */
public class A031060 extends A031057 {

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

