package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031222 Position of n-th 2 in A031219.
 * @author Sean A. Irvine
 */
public class A031222 extends A031219 {

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

