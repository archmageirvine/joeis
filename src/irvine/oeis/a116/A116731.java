package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116731 Number of permutations of length n which avoid the patterns <code>321, 2143, 3124;</code> or avoid the patterns <code>132, 2314, 4312</code>, etc.
 * @author Sean A. Irvine
 */
public class A116731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116731() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 5, 12});
  }
}
