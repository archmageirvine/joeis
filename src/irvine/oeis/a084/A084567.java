package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084567.
 * @author Sean A. Irvine
 */
public class A084567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084567() {
    super(new long[] {3, -2}, new long[] {1, 0});
  }
}
