package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022325.
 * @author Sean A. Irvine
 */
public class A022325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022325() {
    super(new long[] {-1, 0, 2}, new long[] {1, 11, 13});
  }
}
