package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100575 Half the number of permutations of 0..n with exactly two maxima.
 * @author Sean A. Irvine
 */
public class A100575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100575() {
    super(new long[] {16, -20, 8}, new long[] {0, 0, 1});
  }
}
