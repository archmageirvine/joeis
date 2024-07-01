package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A004526 Nonnegative integers repeated, floor(n/2).
 * @author Sean A. Irvine
 */
public class A004526 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.divide2();
  }

  @Override
  public Z a(final Z n) {
    return n.divide2();
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n / 2);
  }

}
