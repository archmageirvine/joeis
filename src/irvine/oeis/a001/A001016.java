package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001016 Eighth powers: a(n) = n^8.
 * @author Sean A. Irvine
 */
public class A001016 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(8);
  }

  @Override
  public Z a(final Z n) {
    return n.pow(8);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(8);
  }

}
