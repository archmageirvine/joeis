package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116773 Number of permutations of length n which avoid the patterns 1432, 2134, 4132; or avoid the patterns 3124, 4123, 4321.
 * @author Sean A. Irvine
 */
public class A116773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116773() {
    super(1, new long[] {-4, 24, -53, 57, -32, 9}, new long[] {1, 2, 6, 21, 73, 241});
  }
}
