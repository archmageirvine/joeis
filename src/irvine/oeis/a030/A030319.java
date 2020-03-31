package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030319.
 * @author Sean A. Irvine
 */
public class A030319 extends A030317 {

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

