package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023471 n-29.
 * @author Sean A. Irvine
 */
public class A023471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023471() {
    super(new long[] {-1, 2}, new long[] {-29, -28});
  }
}
