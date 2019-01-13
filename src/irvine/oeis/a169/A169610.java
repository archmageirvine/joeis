package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169610.
 * @author Sean A. Irvine
 */
public class A169610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169610() {
    super(new long[] {-1, 1, 1}, new long[] {5, 30, 42});
  }
}
