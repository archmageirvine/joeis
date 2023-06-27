package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116823 Number of permutations of length n which avoid the patterns 1342, 3142, 4312; or avoid the patterns 3124, 3412, 3421.
 * @author Sean A. Irvine
 */
public class A116823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116823() {
    super(1, new long[] {-2, 10, -15, 7}, new long[] {1, 2, 6, 21});
  }
}
