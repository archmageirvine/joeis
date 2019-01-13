package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274203.
 * @author Sean A. Irvine
 */
public class A274203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274203() {
    super(new long[] {-1, -1, -1, 1, 3}, new long[] {0, 1, 2, 7, 21});
  }
}
