package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028187.
 * @author Sean A. Irvine
 */
public class A028187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028187() {
    super(new long[] {-3850, 2055, -397, 33}, new long[] {1, 33, 692, 11790});
  }
}
