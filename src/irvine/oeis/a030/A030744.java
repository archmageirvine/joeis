package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030744 Numbers k such that A030737(k) = 2.
 * @author Sean A. Irvine
 */
public class A030744 extends A030737 {

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

