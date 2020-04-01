package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030416.
 * @author Sean A. Irvine
 */
public class A030416 extends A030413 {

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

