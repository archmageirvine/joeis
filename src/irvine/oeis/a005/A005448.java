package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005448.
 * @author Sean A. Irvine
 */
public class A005448 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mN;
    mN = mN.add(1);
    return mN.multiply(3).multiply(t).divide2().add(1);
  }
}
