package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098924 45-gonal numbers: n*(43*n-41)/2.
 * @author Sean A. Irvine
 */
public class A098924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098924() {
    super(new long[] {1, -3, 3}, new long[] {1, 45, 132});
  }
}
