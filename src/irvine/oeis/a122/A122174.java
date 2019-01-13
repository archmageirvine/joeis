package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122174.
 * @author Sean A. Irvine
 */
public class A122174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122174() {
    super(new long[] {-1, 7, -13, 5, 2}, new long[] {1, -4, 6, -24, 41});
  }
}
