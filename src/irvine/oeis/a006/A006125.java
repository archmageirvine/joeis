package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A006125 a(n) = 2^(n*(n-1)/2).
 * @author Sean A. Irvine
 */
public class A006125 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Z.ONE.shiftLeft((long) n * (n - 1) / 2);
  }

}
