package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002378.
 * @author Sean A. Irvine
 */
public class A002378 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = mN;
    mN = mN.add(1);
    return p.multiply(mN);
  }
}
