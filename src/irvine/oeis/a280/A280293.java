package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280293 <code>a(0) = 3, a(n+1) = 2*a(n) +</code> periodic sequence of length <code>2</code>: repeat <code>[-5, 4]</code>.
 * @author Sean A. Irvine
 */
public class A280293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280293() {
    super(new long[] {-2, 1, 2}, new long[] {3, 1, 6});
  }
}
