package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059302 A diagonal of A008296.
 * @author Sean A. Irvine
 */
public class A059302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059302() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, -1, 5, 25, 70});
  }
}
