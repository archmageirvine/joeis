package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125858.
 * @author Sean A. Irvine
 */
public class A125858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125858() {
    super(new long[] {362880, -1026576, 1172700, -723680, 269325, -63273, 9450, -870, 45}, new long[] {10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 999637120});
  }
}
