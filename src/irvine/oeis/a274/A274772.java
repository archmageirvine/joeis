package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274772.
 * @author Sean A. Irvine
 */
public class A274772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274772() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 1, 6, 24, 66, 149});
  }
}
