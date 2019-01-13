package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013952.
 * @author Sean A. Irvine
 */
public class A013952 extends A013949 {

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
