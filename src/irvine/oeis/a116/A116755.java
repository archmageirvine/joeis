package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116755 Number of permutations of length n which avoid the patterns 1234, 2431, 3412.
 * @author Sean A. Irvine
 */
public class A116755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116755() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 71, 213, 561});
  }
}
