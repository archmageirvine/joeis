package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116726 Number of permutations of length n which avoid the patterns 213, 1234, 2431.
 * @author Sean A. Irvine
 */
public class A116726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116726() {
    super(new long[] {1, 1, -1, -2, -1, 3}, new long[] {1, 2, 5, 12, 26, 55});
  }
}
