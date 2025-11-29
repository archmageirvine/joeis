package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A006667 Number of tripling steps to reach 1 from n in '3x+1' problem, or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A006667 extends Sequence1 implements DirectSequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    long c = 0;
    Z m = n.makeOdd();
    while (!Z.ONE.equals(m)) {
      m = m.multiply(3).add(1).makeOdd();
      ++c;
    }
    return Z.valueOf(c);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }
}
