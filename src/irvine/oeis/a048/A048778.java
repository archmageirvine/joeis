package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048778 First partial sums of <code>A048745</code>; second partial sums of <code>A048654</code>.
 * @author Sean A. Irvine
 */
public class A048778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048778() {
    super(new long[] {1, 0, -4, 4}, new long[] {1, 6, 20, 56});
  }
}
