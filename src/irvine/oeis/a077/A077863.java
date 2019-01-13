package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077863.
 * @author Sean A. Irvine
 */
public class A077863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077863() {
    super(new long[] {-2, 0, 1, 2}, new long[] {1, 2, 5, 12});
  }
}
