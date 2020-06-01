package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116742 Number of permutations of length n which avoid the patterns <code>1342, 2341, 4132;</code> or avoid the patterns <code>2431, 3124, 4231</code>.
 * @author Sean A. Irvine
 */
public class A116742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116742() {
    super(new long[] {2, -13, 28, -23, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
