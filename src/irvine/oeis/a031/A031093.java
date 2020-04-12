package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031093 Position of <code>n-th 5</code> in <code>A031087</code>.
 * @author Sean A. Irvine
 */
public class A031093 extends A031087 {

  private long mN = -1;

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

