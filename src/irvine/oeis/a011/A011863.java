package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011863 Nearest integer to <code>(n/2)^4</code>.
 * @author Sean A. Irvine
 */
public class A011863 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(4).divide(16);
  }
}
