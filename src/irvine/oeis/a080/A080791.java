package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080791 Number of nonleading 0's in binary expansion of n.
 * @author Sean A. Irvine
 */
public class A080791 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(mN.bitLength() - mN.bitCount());
  }
}
