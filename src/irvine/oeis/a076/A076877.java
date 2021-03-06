package irvine.oeis.a076;
// Generated by gen_seq4.pl seqop a020 A020330 divide(mN) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a020.A020330;

/**
 * A076877 a(n) = A020330(n) / n.
 * @author Georg Fischer
 */
public class A076877 extends A020330 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A076877() {
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
