package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139275 a(n) = n*(8*n+1).
 * @author Sean A. Irvine
 */
public class A139275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139275() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 34});
  }
}
