package irvine.oeis.a146;
// Generated by gen_seq4.pl seqop a146 A146081 mod(Z.NINE) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;

/**
 * A146082 a(n) = A146081(n) mod 9.
 * @author Georg Fischer
 */
public class A146082 extends A146081 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A146082() {
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
    return super.next().mod(Z.NINE);
  }
}
