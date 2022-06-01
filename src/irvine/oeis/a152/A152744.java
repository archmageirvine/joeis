package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152744 7 times pentagonal numbers: a(n) = 7*n*(3*n-1)/2.
 * @author Sean A. Irvine
 */
public class A152744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152744() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 35});
  }
}
