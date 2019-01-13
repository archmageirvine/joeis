package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041063.
 * @author Sean A. Irvine
 */
public class A041063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041063() {
    super(new long[] {-1, 0, 74, 0}, new long[] {1, 6, 73, 444});
  }
}
