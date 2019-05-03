package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180488 Partial sums of <code>A006864</code>.
 * @author Sean A. Irvine
 */
public class A180488 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180488() {
    super(new long[] {-1, 3, -4, 0, 3}, new long[] {0, 1, 3, 9, 23});
  }
}
