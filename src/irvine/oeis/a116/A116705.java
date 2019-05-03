package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116705 Number of permutations of length n which avoid the patterns <code>1234, 4312</code>.
 * @author Sean A. Irvine
 */
public class A116705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116705() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 2, 6, 22, 86, 321, 1085, 3266, 8797});
  }
}
