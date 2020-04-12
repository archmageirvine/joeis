package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031070 Position of <code>n-th 2</code> in <code>A031067</code>.
 * @author Sean A. Irvine
 */
public class A031070 extends A031067 {

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

