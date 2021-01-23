package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030303 Position of n-th 1 in A030302.
 * @author Sean A. Irvine
 */
public class A030303 extends A030302 {

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

