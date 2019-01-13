package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023537.
 * @author Sean A. Irvine
 */
public class A023537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023537() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 5, 13, 28});
  }
}
