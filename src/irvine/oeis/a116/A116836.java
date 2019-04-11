package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116836 Number of permutations of length n which avoid the patterns <code>2341, 4132, 4321</code>.
 * @author Sean A. Irvine
 */
public class A116836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116836() {
    super(new long[] {2, -7, 7, -10, 16, -27, 29, -19, 7}, new long[] {1, 2, 6, 21, 72, 233, 739, 2343, 7458});
  }
}
