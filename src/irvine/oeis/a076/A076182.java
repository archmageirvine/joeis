package irvine.oeis.a076;
// Generated by gen_seq4.pl seqop a006 A006666 mod(Z.TWO) 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a006.A006666;

/**
 * A076182 a(n) = A006666(n) mod 2.
 * @author Georg Fischer
 */
public class A076182 extends A006666 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A076182() {
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
    return super.next().mod(Z.TWO);
  }
}
