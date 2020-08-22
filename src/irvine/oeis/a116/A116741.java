package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116741 Number of permutations of length n which avoid the patterns 1342, 2314, 4213.
 * @author Sean A. Irvine
 */
public class A116741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116741() {
    super(new long[] {2, -17, 56, -92, 82, -40, 10}, new long[] {1, 2, 6, 21, 73, 241, 757});
  }
}
