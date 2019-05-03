package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116709 Number of permutations of length n which avoid the patterns <code>2341, 4213</code>.
 * @author Sean A. Irvine
 */
public class A116709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116709() {
    super(new long[] {2, -10, 25, -22, 8}, new long[] {1, 2, 6, 22, 86});
  }
}
