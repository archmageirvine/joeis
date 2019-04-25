package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263790 The number of length-n permutations avoiding the patterns 1234, 1324 and 2143.
 * @author Sean A. Irvine
 */
public class A263790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263790() {
    super(new long[] {-1, 2, -2, 4}, new long[] {1, 1, 2, 6});
  }
}
