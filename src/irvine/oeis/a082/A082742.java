package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082742 Indices of occurrences of 2 in <code>A004738</code>.
 * @author Sean A. Irvine
 */
public class A082742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082742() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {2, 4, 6, 8, 12});
  }
}
