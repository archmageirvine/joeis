package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116746 Number of permutations of length n which avoid the patterns 1243, 4123, 4213.
 * @author Sean A. Irvine
 */
public class A116746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116746() {
    super(new long[] {-6, -1, 22, -22, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
