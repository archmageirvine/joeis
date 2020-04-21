package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031256 Position of <code>n-th 2</code> in <code>A031253</code>.
 * @author Sean A. Irvine
 */
public class A031256 extends A031253 {

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

