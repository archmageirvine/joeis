package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116841 Number of permutations of length n which avoid the patterns 1234, 1324, 2431.
 * @author Sean A. Irvine
 */
public class A116841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116841() {
    super(new long[] {-4, 32, -97, 119, 43, -349, 534, -448, 231, -73, 13}, new long[] {1, 2, 6, 21, 75, 258, 842, 2614, 7787, 22466, 63273});
  }
}
