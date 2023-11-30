package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A014682 The Collatz or 3x+1 function: a(n) = n/2 if n is even, otherwise (3n+1)/2.
 * @author Sean A. Irvine
 */
public class A014682 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.isEven() ? mN.divide2() : mN.multiply(3).add(1).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return n.isEven() ? n.divide2() : n.multiply(3).add(1).divide2();
  }

}
