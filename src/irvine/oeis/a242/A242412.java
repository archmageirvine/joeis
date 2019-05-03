package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242412 <code>a(n) =</code> normalized inverse radius of the inscribed circle that is tangent to the left circle of the symmetric arbelos and the n-th and <code>(n-1)-st</code> circles in the Pappus chain.
 * @author Sean A. Irvine
 */
public class A242412 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242412() {
    super(new long[] {1, -3, 3}, new long[] {15, 23, 39});
  }
}
