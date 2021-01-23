package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030356 Position of n-th 2 in A030353.
 * @author Sean A. Irvine
 */
public class A030356 extends A030353 {

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

