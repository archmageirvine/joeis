package irvine.oeis.a126;
// Generated by gen_seq4.pl seqop a005 A005278 divide2() 1 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a005.A005278;

/**
 * A126887 a(n) = A005278(n)/2.
 * @author Georg Fischer
 */
public class A126887 extends A005278 {
  private int mN = 0;
  
  /** Construct the sequence. */
  public A126887() {
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
