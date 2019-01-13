package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023552.
 * @author Sean A. Irvine
 */
public class A023552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023552() {
    super(new long[] {1, -1, -2, 3}, new long[] {3, 7, 15, 28});
  }
}
