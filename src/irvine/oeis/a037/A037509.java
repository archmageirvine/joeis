package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037509.
 * @author Sean A. Irvine
 */
public class A037509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037509() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 10, 80, 641});
  }
}
