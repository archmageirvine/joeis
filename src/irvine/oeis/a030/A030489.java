package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030489 Position of n-th 2 in A030298.
 * @author Sean A. Irvine
 */
public class A030489 extends A030298 {

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

