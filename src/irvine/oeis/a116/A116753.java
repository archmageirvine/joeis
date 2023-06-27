package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116753 Number of permutations of length n which avoid the patterns 2134, 3241, 4312.
 * @author Sean A. Irvine
 */
public class A116753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116753() {
    super(1, new long[] {-8, 52, -146, 231, -225, 138, -52, 11}, new long[] {1, 2, 6, 21, 73, 236, 705, 1970});
  }
}
