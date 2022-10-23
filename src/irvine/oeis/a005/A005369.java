package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005369 a(n) = 1 if n is of the form m(m+1), else 0.
 * @author Sean A. Irvine
 */
public class A005369 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(4).add(1).sqrtAndRemainder()[1].isZero() ? Z.ONE : Z.ZERO;
  }
}
