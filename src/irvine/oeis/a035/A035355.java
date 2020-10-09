package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035355 "BHK" (reversible, identity, unlabeled) transform of A035353.
 * @author Sean A. Irvine
 */
public class A035355 extends A035353 {

  @Override
  public Z next() {
    super.next();
    return mN == 0 ? Z.ONE : bhk(mA, mN).coeff(mN);
  }
}
