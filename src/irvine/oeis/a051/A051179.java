package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A051179 a(n) = 2^(2^n) - 1.
 * @author Sean A. Irvine
 */
public class A051179 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Z.TWO.pow(Z.TWO.pow(n)).subtract(1);
  }

  @Override
  public Z a(final int n) {
    return Z.ONE.shiftLeft(1L << n).subtract(1);
  }

}
