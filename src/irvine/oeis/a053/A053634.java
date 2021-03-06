package irvine.oeis.a053;
// Generated by gen_seq4.pl seqop a000 A000031 divide(2) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000031;

/**
 * A053634 a(n) = Sum_{ d divides n } phi(d)*2^(n/d)/(2n).
 * @author Georg Fischer
 */
public class A053634 extends A000031 {
  private int mN = 3 - 1;
  
  /** Construct the sequence. */
  public A053634() {
    super();
    int bOffset = -1;
    while (bOffset < mN) {
      ++bOffset;
      super.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().divide(2);
  }
}
