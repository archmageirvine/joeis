package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291986.
 * @author Sean A. Irvine
 */
public class A291986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291986() {
    super(new long[] {6, -6, -3, 1, 2, 1}, new long[] {1, 1, 3, 6, 10, 16});
  }
}
