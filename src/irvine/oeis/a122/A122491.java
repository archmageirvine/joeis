package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122491.
 * @author Sean A. Irvine
 */
public class A122491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122491() {
    super(new long[] {1, 1, -3, -1, 3}, new long[] {0, 0, 0, 2, 5});
  }
}
