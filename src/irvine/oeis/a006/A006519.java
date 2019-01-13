package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006519.
 * @author Sean A. Irvine
 */
public class A006519 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mN.makeOdd();
    return Z.ONE.shiftLeft((int) mN.auxiliary());
  }
}
