package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023467 n-25.
 * @author Sean A. Irvine
 */
public class A023467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023467() {
    super(new long[] {-1, 2}, new long[] {-25, -24});
  }
}
