package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116764 Number of permutations of length n which avoid the patterns 1423, 2134, 3214.
 * @author Sean A. Irvine
 */
public class A116764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116764() {
    super(new long[] {-9, 19, -17, 7}, new long[] {1, 2, 6, 21});
  }
}
