package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116824 Number of permutations of length n which avoid the patterns 1234, 3412, 3421.
 * @author Sean A. Irvine
 */
public class A116824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116824() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 73, 229, 634});
  }
}
