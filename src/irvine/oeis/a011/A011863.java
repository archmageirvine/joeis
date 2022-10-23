package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011863 Nearest integer to (n/2)^4.
 * @author Sean A. Irvine
 */
public class A011863 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(4).divide(16);
  }
}
