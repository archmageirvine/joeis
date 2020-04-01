package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030366.
 * @author Sean A. Irvine
 */
public class A030366 extends A030363 {

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

