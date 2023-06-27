package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158370 576n + 1.
 * @author Sean A. Irvine
 */
public class A158370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158370() {
    super(1, new long[] {-1, 2}, new long[] {577, 1153});
  }
}
