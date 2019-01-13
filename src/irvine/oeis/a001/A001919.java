package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001919.
 * @author Sean A. Irvine
 */
public class A001919 implements Sequence {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return mN.multiply(n2.subtract(1)).multiply(n2.subtract(4)).multiply(n2.add(mN.multiply(21)).add(180)).divide(5040);
  }
}
