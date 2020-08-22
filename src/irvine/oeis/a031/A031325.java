package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031325 Position of n-th 0 in A031324.
 * @author Sean A. Irvine
 */
public class A031325 extends A031324 {

  {
    super.next();
    super.next();
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

