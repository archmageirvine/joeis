package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023480 n-38.
 * @author Sean A. Irvine
 */
public class A023480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023480() {
    super(new long[] {-1, 2}, new long[] {-38, -37});
  }
}
