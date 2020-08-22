package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031118 Position of n-th 6 in A031111.
 * @author Sean A. Irvine
 */
public class A031118 extends A031111 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.SIX.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

