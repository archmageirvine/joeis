package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116755 Number of permutations of length n which avoid the patterns <code>1234, 2431, 3412</code>.
 * @author Sean A. Irvine
 */
public class A116755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116755() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 71, 213, 561});
  }
}
