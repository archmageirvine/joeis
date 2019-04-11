package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116793 Number of permutations of length n which avoid the patterns <code>1432, 2143, 3124</code>; or avoid the patterns <code>1432, 2314, 3142</code>.
 * @author Sean A. Irvine
 */
public class A116793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116793() {
    super(new long[] {1, -3, 11, -12, 6}, new long[] {1, 2, 6, 21, 74});
  }
}
