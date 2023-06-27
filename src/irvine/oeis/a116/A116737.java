package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116737 Number of permutations of length n which avoid the patterns 3412, 4123, 4321.
 * @author Sean A. Irvine
 */
public class A116737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116737() {
    super(1, new long[] {1, 1, -1, -1, 2, 1, 3}, new long[] {1, 2, 6, 21, 72, 246, 845});
  }
}
