package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162483 <code>a(n)</code> is the number of perfect matchings of <code>an</code> edge-labeled 2 X <code>(2n+1)</code> Mobius grid graph.
 * @author Sean A. Irvine
 */
public class A162483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162483() {
    super(new long[] {1, -4, 4}, new long[] {3, 6, 13});
  }
}
