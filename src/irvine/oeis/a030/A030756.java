package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030756.
 * @author Sean A. Irvine
 */
public class A030756 extends A030747 {

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

