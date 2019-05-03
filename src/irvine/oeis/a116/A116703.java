package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116703 Number of permutations of length n which avoid the patterns <code>231, 4123</code>.
 * @author Sean A. Irvine
 */
public class A116703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116703() {
    super(new long[] {3, -5, 4}, new long[] {1, 2, 5});
  }
}
