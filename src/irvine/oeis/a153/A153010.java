package irvine.oeis.a153;

import irvine.math.z.Z;

/**
 * A153010 Indices of A153007 where the entry equals zero.
 * @author Sean A. Irvine
 */
public class A153010 extends A153007 {

  private long mN = -1;

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

