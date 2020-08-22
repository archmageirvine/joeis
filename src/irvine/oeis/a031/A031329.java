package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031329 Position of n-th 4 in A031324.
 * @author Sean A. Irvine
 */
public class A031329 extends A031324 {

  {
    super.next();
    super.next();
  }

  private long mN = 0;

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

