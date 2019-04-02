package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116777 Number of permutations of length n which avoid the patterns 2314, 3142, 4312.
 * @author Sean A. Irvine
 */
public class A116777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116777() {
    super(new long[] {-3, 19, -45, 52, -31, 9}, new long[] {1, 2, 6, 21, 74, 253});
  }
}
