package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030786.
 * @author Sean A. Irvine
 */
public class A030786 extends A030777 {

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

