package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274755 Repunits with even indices multiplied by 99, i.e., 99*(11, 1111, 111111, 11111111, ...).
 * @author Sean A. Irvine
 */
public class A274755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274755() {
    super(1, new long[] {-100, 101}, new long[] {1089, 109989});
  }
}
