package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031334 Position of n-th 9 in A031324.
 * @author Sean A. Irvine
 */
public class A031334 extends A031324 {

  {
    setOffset(1);
    super.next();
    super.next();
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.NINE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

