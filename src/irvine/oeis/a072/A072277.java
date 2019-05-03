package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072277 Smallest integer <code>&gt; 1</code> which is both n-gonal and centered <code>n-gonal</code>.
 * @author Sean A. Irvine
 */
public class A072277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072277() {
    super(new long[] {-1, 4, -6, 4}, new long[] {10, 25, 51, 91});
  }
}
