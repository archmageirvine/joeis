package irvine.oeis.a153;

import irvine.math.z.Z;

/**
 * A153010.
 * @author Sean A. Irvine
 */
public class A153010 extends A153007 {

  private long mN = -1;

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

