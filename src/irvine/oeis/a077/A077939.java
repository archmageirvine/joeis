package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077939.
 * @author Sean A. Irvine
 */
public class A077939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077939() {
    super(new long[] {1, 1, 2}, new long[] {1, 2, 5});
  }
}
