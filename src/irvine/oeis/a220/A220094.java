package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220094 Sum of the n-digit base-ten numbers whose digits are nonzero.
 * @author Sean A. Irvine
 */
public class A220094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220094() {
    super(new long[] {-810, 99}, new long[] {45, 4455});
  }
}
