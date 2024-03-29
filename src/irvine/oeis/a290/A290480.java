package irvine.oeis.a290;
// Generated by gen_seq4.pl seqop a061 A061537 divide(mN) 1 at 2021-10-28 23:47
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a061.A061537;

/**
 * A290480 Product of proper unitary divisors of n.
 *
 * @author Georg Fischer
 */
public class A290480 extends A061537 {
  private int mN = 0;

  /** Construct the sequence. */
  public A290480() {
    super();
    int bOffset = 0;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(mN);
  }
}
