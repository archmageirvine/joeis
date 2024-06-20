package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001014 Sixth powers: a(n) = n^6.
 * @author Sean A. Irvine
 */
public class A001014 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return n.pow(6);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).pow(6);
  }

}
