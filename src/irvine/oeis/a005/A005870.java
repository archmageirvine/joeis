package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a004.A004012;

/**
 * A005870 Numbers represented by hexagonal <code>close-packing</code>.
 * @author Sean A. Irvine
 */
public class A005870 extends A004012 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!Z.ZERO.equals(super.next())) {
        return mN;
      }
    }
  }
}
