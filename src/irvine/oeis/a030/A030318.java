package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030318 Position of n-th 0 in A030317.
 * @author Sean A. Irvine
 */
public class A030318 extends A030317 {

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

