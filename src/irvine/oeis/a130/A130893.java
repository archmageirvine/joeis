package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130893 Lucas numbers (beginning with 1) mod 10.
 * @author Sean A. Irvine
 */
public class A130893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130893() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 1, 8, 9, 7, 6, 3, 9, 2});
  }
}
