package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A001919 Eighth column of quadrinomial coefficients.
 * @author Sean A. Irvine
 */
public class A001919 extends Sequence3 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return mN.multiply(n2.subtract(1)).multiply(n2.subtract(4)).multiply(n2.add(mN.multiply(21)).add(180)).divide(5040);
  }
}
