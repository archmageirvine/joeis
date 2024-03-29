package irvine.oeis.a133;
// Generated by gen_seq4.pl seqop a000 A000396 divide2() 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000396;

/**
 * A133028 Even perfect numbers divided by 2.
 * @author Georg Fischer
 */
public class A133028 extends A000396 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A133028() {
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
    return super.next().divide2();
  }
}
