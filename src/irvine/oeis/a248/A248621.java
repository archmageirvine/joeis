package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248621.
 * @author Sean A. Irvine
 */
public class A248621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248621() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 16, 120, 456, 1240});
  }
}
