package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291257.
 * @author Sean A. Irvine
 */
public class A291257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291257() {
    super(new long[] {-1, -2, 4, 2}, new long[] {1, 3, 9, 28});
  }
}
