package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203627 Numbers which are both <code>9-gonal</code> (nonagonal) and <code>10-gonal</code> (decagonal).
 * @author Sean A. Irvine
 */
public class A203627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203627() {
    super(new long[] {1, -806403, 806403}, new long[] {1, 1212751, 977965238701L});
  }
}
