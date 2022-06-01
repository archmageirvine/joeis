package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261972 The first of three consecutive positive integers the sum of the squares of which is equal to the sum of the squares of four consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A261972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261972() {
    super(new long[] {1, -15, 15}, new long[] {25, 361, 5041});
  }
}
