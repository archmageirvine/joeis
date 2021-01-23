package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031221 Position of n-th 1 in A031219.
 * @author Sean A. Irvine
 */
public class A031221 extends A031219 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

