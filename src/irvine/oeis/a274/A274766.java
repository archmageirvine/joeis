package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274766 Multiplication of pair of contiguous repunits, i.e., (0*1, 1*11, 11*111, 111*1111, 1111*11111, ...).
 * @author Sean A. Irvine
 */
public class A274766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274766() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 11, 1221});
  }
}
