package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033304.
 * @author Sean A. Irvine
 */
public class A033304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033304() {
    super(new long[] {-1, 1, 2}, new long[] {2, 6, 11});
  }
}
