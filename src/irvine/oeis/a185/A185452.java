package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A185452 Image of n under the map n -&gt; n/2 if n even, (5*n+1)/2 if n odd.
 * @author Sean A. Irvine
 */
public class A185452 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A185452() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 3, 1, 8});
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    return n.testBit(0) ? n.multiply(5).add(1).divide(2) : n.divide(2);
  }
}
