package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116820 Number of permutations of length n which avoid the patterns 2341, 3241, 4213.
 * @author Sean A. Irvine
 */
public class A116820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116820() {
    super(new long[] {1, -14, 29, -23, 8}, new long[] {1, 2, 6, 21, 75});
  }
}
