package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235988 Sum of the partition parts of 3n into 3 parts.
 * @author Sean A. Irvine
 */
public class A235988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235988() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {3, 18, 63, 144, 285, 486});
  }
}
