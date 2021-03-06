package irvine.oeis.a286;
// Generated by gen_seq4.pl seqop a010 A010815 add(mN) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a010.A010815;

/**
 * A286956 Main diagonal of A286950.
 * @author Georg Fischer
 */
public class A286956 extends A010815 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A286956() {
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
    return super.next().add(mN);
  }
}
