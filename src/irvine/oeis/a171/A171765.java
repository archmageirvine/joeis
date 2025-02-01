package irvine.oeis.a171;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A074851.
 * @author Sean A. Irvine
 */
public class A171765 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z a(final Z n) {
    return n.compareTo(Z.TEN) <= 0 ? Z.ZERO : Functions.DIGIT_PRODUCT.z(n);
  }

  @Override
  public Z a(final int n) {
    return null;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }
}
