package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116783 Number of permutations of length n which avoid the patterns 1234, 2431, 4231.
 * @author Sean A. Irvine
 */
public class A116783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116783() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 73, 232, 654});
  }
}
