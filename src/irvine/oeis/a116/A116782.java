package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116782 Number of permutations of length n which avoid the patterns 3421, 4123, 4231; or avoid the patterns 1342, 3142, 4213.
 * @author Sean A. Irvine
 */
public class A116782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116782() {
    super(1, new long[] {-2, 9, -11, 6}, new long[] {1, 2, 6, 21});
  }
}
