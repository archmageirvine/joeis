package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006577 Number of halving and tripling steps to reach 1 in '3x+1' problem, or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A006577 extends AbstractSequence {

  /* Construct the sequence. */
  public A006577() {
    super(1);
  }

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long c = 0;
    while (!Z.ONE.equals(m)) {
      ++c;
      m = m.isEven() ? m.divide2() : m.multiply(3).add(1);
    }
    return Z.valueOf(c);
  }
}
