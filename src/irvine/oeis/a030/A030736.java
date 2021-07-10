package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030736 Numbers k such that A030727(k) = 4.
 * @author Sean A. Irvine
 */
public class A030736 extends A030727 {

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

