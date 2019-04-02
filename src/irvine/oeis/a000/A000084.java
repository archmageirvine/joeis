package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000084 Number of series-parallel networks with n unlabeled edges. Also called yoke-chains by Cayley and MacMahon.
 * @author Sean A. Irvine
 */
public class A000084 extends A000669 {

  @Override
  public Z next() {
    final Z r = super.next();
    return mN == 1 ? r : r.multiply2();
  }
}

