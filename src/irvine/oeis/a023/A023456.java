package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023456 n-14.
 * @author Sean A. Irvine
 */
public class A023456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023456() {
    super(new long[] {-1, 2}, new long[] {-14, -13});
  }
}
