package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030568 Position of n-th 0 in A030567.
 * @author Sean A. Irvine
 */
public class A030568 extends A030567 {

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

