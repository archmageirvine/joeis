package irvine.oeis.a346;
// Generated by gen_seq4.pl seqop a007 A007814 mod(Z.FOUR) 1 at 2021-10-28 23:47
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a007.A007814;

/**
 * A346070 Symbolic code for the corner turns in the L\u00e9vy dragon curve.
 *
 * @author Georg Fischer
 */
public class A346070 extends A007814 {
  private int mN = 0;

  /** Construct the sequence. */
  public A346070() {
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
    return super.next().mod(Z.FOUR);
  }
}
