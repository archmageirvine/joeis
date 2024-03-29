package irvine.oeis.a238;
// Generated by gen_seq4.pl seqop a043 A043688 add(1) 1 at 2021-10-28 23:47
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a043.A043688;

/**
 * A238247 Numbers m such that A072219(m) = 5.
 *
 * @author Georg Fischer
 */
public class A238247 extends A043688 {
  private int mN = 0;

  /** Construct the sequence. */
  public A238247() {
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
