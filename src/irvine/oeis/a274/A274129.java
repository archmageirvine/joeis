package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274129 Sum of all numbers that appear when we interpret an ordered subset of <code>[0,1,...,n]</code> containing n as the digits, possibly larger than nine, of a base ten number, with the smallest element being the least significant.
 * @author Sean A. Irvine
 */
public class A274129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274129() {
    super(new long[] {242, -165, 24}, new long[] {11, 253, 4257});
  }
}
