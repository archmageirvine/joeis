package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030793.
 * @author Sean A. Irvine
 */
public class A030793 extends A030787 {

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

