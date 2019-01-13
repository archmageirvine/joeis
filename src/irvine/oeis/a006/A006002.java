package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006002.
 * @author Sean A. Irvine
 */
public class A006002 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z n = mN;
    mN = mN.add(1);
    return mN.square().multiply(n).divide2();
  }
}
