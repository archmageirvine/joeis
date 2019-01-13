package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279275.
 * @author Sean A. Irvine
 */
public class A279275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279275() {
    super(new long[] {1, -1443, 1443}, new long[] {500, 721525, 1040439075});
  }
}
