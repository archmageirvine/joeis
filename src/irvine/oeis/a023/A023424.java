package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023424.
 * @author Sean A. Irvine
 */
public class A023424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023424() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, 3, 7, 15, 31});
  }
}
