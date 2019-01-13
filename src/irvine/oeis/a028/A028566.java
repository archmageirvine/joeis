package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028566.
 * @author Sean A. Irvine
 */
public class A028566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028566() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 20});
  }
}
