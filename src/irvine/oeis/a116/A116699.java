package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116699 Number of permutations of length n which avoid the patterns 123 and 4312.
 * @author Sean A. Irvine
 */
public class A116699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116699() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2, 5, 13, 30});
  }
}
