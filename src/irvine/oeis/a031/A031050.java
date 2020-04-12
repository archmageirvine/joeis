package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031050 Position of <code>n-th 4</code> in <code>A031045</code>.
 * @author Sean A. Irvine
 */
public class A031050 extends A031045 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

