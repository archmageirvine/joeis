package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002943.
 * @author Sean A. Irvine
 */
public class A002943 implements Sequence {

  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(2);
    return mN.multiply(mN.add(1));
  }
}
