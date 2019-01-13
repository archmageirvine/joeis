package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001834.
 * @author Sean A. Irvine
 */
public class A001834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001834() {
    super(new long[] {-1, 4}, new long[] {1, 5});
  }
}
