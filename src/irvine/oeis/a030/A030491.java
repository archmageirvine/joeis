package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030491 Position of n-th 4 in A030298.
 * @author Sean A. Irvine
 */
public class A030491 extends A030298 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FOUR.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

