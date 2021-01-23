package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030366 Position of n-th 2 in A030363.
 * @author Sean A. Irvine
 */
public class A030366 extends A030363 {

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

