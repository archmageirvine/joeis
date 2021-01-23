package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030403 Position of n-th 1 in A030401.
 * @author Sean A. Irvine
 */
public class A030403 extends A030401 {

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

