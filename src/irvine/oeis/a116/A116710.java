package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116710 Number of permutations of length n which avoid the patterns 1423, 3421.
 * @author Sean A. Irvine
 */
public class A116710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116710() {
    super(1, new long[] {2, -18, 63, -109, 99, -47, 11}, new long[] {1, 2, 6, 22, 86, 337, 1299});
  }
}
