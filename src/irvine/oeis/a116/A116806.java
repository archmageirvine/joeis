package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116806 Number of permutations of length n which avoid the patterns 2314, 4213, 4312.
 * @author Sean A. Irvine
 */
public class A116806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116806() {
    super(new long[] {-4, 20, -45, 52, -31, 9}, new long[] {1, 2, 6, 21, 75, 262});
  }
}
