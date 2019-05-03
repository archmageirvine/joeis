package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116823 Number of permutations of length n which avoid the patterns <code>1342, 3142, 4312</code>; or avoid the patterns <code>3124, 3412, 3421</code>.
 * @author Sean A. Irvine
 */
public class A116823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116823() {
    super(new long[] {-2, 10, -15, 7}, new long[] {1, 2, 6, 21});
  }
}
