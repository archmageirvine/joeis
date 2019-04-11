package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293292 Numbers with last digit less than 5 (in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A293292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293292() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 10});
  }
}
