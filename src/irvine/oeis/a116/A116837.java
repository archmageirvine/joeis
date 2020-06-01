package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116837 Number of permutations of length n which avoid the patterns <code>3421, 4123, 4312;</code> or avoid the patterns <code>2341, 3142, 3214</code>.
 * @author Sean A. Irvine
 */
public class A116837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116837() {
    super(new long[] {-2, 6, -7, 5}, new long[] {1, 2, 6, 21});
  }
}
