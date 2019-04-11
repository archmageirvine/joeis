package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116773 Number of permutations of length n which avoid the patterns <code>1432, 2134, 4132</code>; or avoid the patterns <code>3124, 4123, 4321</code>.
 * @author Sean A. Irvine
 */
public class A116773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116773() {
    super(new long[] {-4, 24, -53, 57, -32, 9}, new long[] {1, 2, 6, 21, 73, 241});
  }
}
