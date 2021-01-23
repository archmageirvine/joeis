package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030554 Position of n-th 5 in A030548.
 * @author Sean A. Irvine
 */
public class A030554 extends A030548 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.FIVE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

