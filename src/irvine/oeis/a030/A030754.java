package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030754.
 * @author Sean A. Irvine
 */
public class A030754 extends A030747 {

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

