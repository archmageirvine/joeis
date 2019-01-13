package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005891.
 * @author Sean A. Irvine
 */
public class A005891 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(5).divide2().add(1);
  }
}
