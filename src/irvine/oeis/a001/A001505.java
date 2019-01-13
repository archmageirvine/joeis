package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001505.
 * @author Sean A. Irvine
 */
public class A001505 implements Sequence {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.multiply(mN.add(1)).multiply(mN.add(2));
  }
}
