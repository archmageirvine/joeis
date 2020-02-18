package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026185 If n even, then <code>2n</code>. If n odd, then nearest integer to <code>2n/3</code>.
 * @author Sean A. Irvine
 */
public class A026185 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.multiply2() : mN.multiply(4).add(3).divide(6);
  }
}
