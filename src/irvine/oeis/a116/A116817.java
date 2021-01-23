package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116817 Number of permutations of length n which avoid the patterns 2341, 3241, 4132.
 * @author Sean A. Irvine
 */
public class A116817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116817() {
    super(new long[] {-1, 3, 3, -10, 6}, new long[] {1, 2, 6, 21, 74});
  }
}
