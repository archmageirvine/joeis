package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006577 Number of halving and tripling steps to reach 1 in '3x+1' problem, or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A006577 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006577(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006577() {
    super(1);
  }

  protected Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return a(mN);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z m = n;
    long c = 0;
    while (!Z.ONE.equals(m)) {
      m = m.makeOdd();
      c += m.auxiliary();
      if (Z.ONE.equals(m)) {
        return Z.valueOf(c);
      }
      m = m.multiply(3).add(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
