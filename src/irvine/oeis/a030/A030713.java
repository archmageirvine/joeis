package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030713 Numbers k such that A030707(k) = 1.
 * @author Sean A. Irvine
 */
public class A030713 extends A030707 {

  private long mN = 0;

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

