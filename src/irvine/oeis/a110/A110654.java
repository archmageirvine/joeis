package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A110654 a(n) = ceiling(n/2), or: a(2*k) = k, a(2*k+1) = k+1.
 * @author Sean A. Irvine
 */
public class A110654 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A110654() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 1});
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? n.divide2().add(1) : n.divide2();
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf((n & 1) == 1 ? n / 2 + 1 : n / 2);
  }

}
