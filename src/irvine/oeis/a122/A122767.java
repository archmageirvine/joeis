package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122767.
 * @author Sean A. Irvine
 */
public class A122767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122767() {
    super(new long[] {-300, 120, 6}, new long[] {0, 2, 12});
  }
}
