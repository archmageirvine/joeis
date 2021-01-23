package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030569 Position of n-th 1 in A030567.
 * @author Sean A. Irvine
 */
public class A030569 extends A030567 {

  private long mN = -1;

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

