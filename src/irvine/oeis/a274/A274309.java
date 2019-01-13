package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274309.
 * @author Sean A. Irvine
 */
public class A274309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274309() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {2, 1, 3, 3, 1, 1, 3, 5, 3, 1, 1, 3, 3, 1, 2});
  }
}
