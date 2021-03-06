package irvine.oeis.a293;
// Generated by gen_seq4.pl seqop a027 A027437 add(1) 0 at 2020-01-25 22:40
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a027.A027437;

/**
 * A293337 Least integer k such that k/2^n &gt; e.
 * @author Georg Fischer
 */
public class A293337 extends A027437 {
  private int mN = -1;
  
  /** Construct the sequence. */
  public A293337() {
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
    return super.next().add(1);
  }
}
