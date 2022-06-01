package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116768 Number of permutations of length n which avoid the patterns 1342, 3214, 4213.
 * @author Sean A. Irvine
 */
public class A116768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116768() {
    super(new long[] {2, -11, 21, -18, 7}, new long[] {1, 2, 6, 21, 73});
  }
}
