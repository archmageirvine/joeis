package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279275 Numbers k such that <code>2*k+1</code> and <code>5*k+1</code> are both pentagonal numbers (A000326).
 * @author Sean A. Irvine
 */
public class A279275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279275() {
    super(new long[] {1, -1443, 1443}, new long[] {500, 721525, 1040439075});
  }
}
