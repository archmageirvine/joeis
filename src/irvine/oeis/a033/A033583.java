package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033583.
 * @author Sean A. Irvine
 */
public class A033583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033583() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 40});
  }
}
