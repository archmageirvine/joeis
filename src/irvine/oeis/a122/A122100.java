package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122100.
 * @author Sean A. Irvine
 */
public class A122100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122100() {
    super(new long[] {-1, 0, 3}, new long[] {1, -1, 0});
  }
}
