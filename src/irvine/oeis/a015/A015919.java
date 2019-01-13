package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015919.
 * @author Sean A. Irvine
 */
public class A015919 extends A015910 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Z.TWO.mod(mN))) {
        return mN;
      }
    }
  }
}
