package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001512.
 * @author Sean A. Irvine
 */
public class A001512 implements Sequence {

  private Z mN = Z.valueOf(-4);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.multiply(mN.add(1)).multiply(mN.add(2)).multiply(mN.add(3));
  }
}
