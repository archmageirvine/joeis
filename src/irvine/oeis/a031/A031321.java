package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031321 Position of <code>n-th 8</code> in <code>A031312</code>.
 * @author Sean A. Irvine
 */
public class A031321 extends A031312 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.EIGHT.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

