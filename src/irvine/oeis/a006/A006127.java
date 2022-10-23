package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006127 a(n) = 2^n + n.
 * @author Sean A. Irvine
 */
public class A006127 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).add(mN);
  }
}
