package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030714 Numbers k such that A030707(k) = 2.
 * @author Sean A. Irvine
 */
public class A030714 extends A030707 {

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

