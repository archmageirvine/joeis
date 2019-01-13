package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221364.
 * @author Sean A. Irvine
 */
public class A221364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221364() {
    super(new long[] {1, 0, -4, 0, 4, 0}, new long[] {1, 1, 1, 5, 1, 16});
  }
}
