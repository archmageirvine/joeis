package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274743 Repunits with odd indices multiplied by 99, i.e., 99*(1, 111, 11111, 1111111, ...).
 * @author Sean A. Irvine
 */
public class A274743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274743() {
    super(1, new long[] {-100, 101}, new long[] {99, 10989});
  }
}
