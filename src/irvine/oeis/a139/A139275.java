package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139275 <code>a(n) = n*(8*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A139275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139275() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 34});
  }
}
