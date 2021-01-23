package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031077 Position of n-th 0 in A031076.
 * @author Sean A. Irvine
 */
public class A031077 extends A031076 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

