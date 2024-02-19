package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116714 Number of permutations of length n that avoid the patterns 321, 1342, 4123.
 * @author Georg Fischer
 */
public class A116714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116714() {
    super(0, new long[] {-1, 0, 0, 2}, new long[] {2, 5, 12, 24}, 1, 1);
  }
}
