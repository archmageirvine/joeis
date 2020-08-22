package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152734 5 times pentagonal numbers: 5*n*(3*n-1)/2.
 * @author Sean A. Irvine
 */
public class A152734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152734() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 25});
  }
}
