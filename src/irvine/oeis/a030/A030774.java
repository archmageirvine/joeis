package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030774 Numbers k such that A030767(k) = 2.
 * @author Sean A. Irvine
 */
public class A030774 extends A030767 {

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

