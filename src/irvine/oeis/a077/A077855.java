package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077855.
 * @author Sean A. Irvine
 */
public class A077855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077855() {
    super(new long[] {-1, 2, -3, 3}, new long[] {1, 3, 6, 11});
  }
}
