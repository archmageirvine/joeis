package irvine.oeis.a326;
// Generated by gen_seq4.pl seqop a005 A005820 divide2() 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a005.A005820;

/**
 * A326051 1/2 times 3-perfect (triply perfect, tri-perfect, triperfect or sous-double) numbers: a(n) = A005820(n)/2.
 * @author Georg Fischer
 */
public class A326051 extends A005820 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A326051() {
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
