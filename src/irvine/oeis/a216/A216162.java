package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216162.
 * @author Sean A. Irvine
 */
public class A216162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216162() {
    super(new long[] {1, 0, -1, 0, -6, 0, 6, 0, 1, 0}, new long[] {1, 0, 1, 1, 2, 4, 4, 9, 11, 26});
  }
}
