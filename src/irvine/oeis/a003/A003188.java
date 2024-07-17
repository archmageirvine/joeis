package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A003188 Decimal equivalent of Gray code for n.
 * @author Sean A. Irvine
 */
public class A003188 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z a(final Z n) {
    return Functions.GRAY_ENCODE.z(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return Functions.GRAY_ENCODE.z(mN);
  }
}
