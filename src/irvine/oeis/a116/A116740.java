package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116740 Number of permutations of length n which avoid the patterns <code>1243, 2341, 4132</code>.
 * @author Sean A. Irvine
 */
public class A116740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116740() {
    super(new long[] {4, -36, 137, -292, 386, -329, 181, -62, 12}, new long[] {1, 2, 6, 21, 73, 239, 740, 2199, 6348});
  }
}
