package irvine.oeis.a062;
// Generated by gen_seq4.pl seqop a053 A053645 add(1) 1 at 2021-10-28 23:47
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a053.A053645;

/**
 * A062050 n-th chunk consists of the numbers 1, ..., 2^n.
 *
 * @author Georg Fischer
 */
public class A062050 extends A053645 {
  private int mN = 0;

  /** Construct the sequence. */
  public A062050() {
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
    return super.next().add(1);
  }
}
