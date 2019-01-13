package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138269.
 * @author Sean A. Irvine
 */
public class A138269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138269() {
    super(new long[] {-1, 5, -4, 5}, new long[] {1, 3, 12, 53});
  }
}
