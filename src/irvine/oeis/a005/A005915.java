package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005915.
 * @author Sean A. Irvine
 */
public class A005915 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(3).add(6).multiply(mN).add(4).multiply(mN).add(1);
  }
}
