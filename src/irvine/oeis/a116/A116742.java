package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116742 Number of permutations of length n which avoid the patterns 1342, 2341, 4132; or avoid the patterns 2431, 3124, 4231.
 * @author Sean A. Irvine
 */
public class A116742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116742() {
    super(1, new long[] {2, -13, 28, -23, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
