package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116849 Number of permutations of length n which avoid the patterns 213, 51432.
 * @author Sean A. Irvine
 */
public class A116849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116849() {
    super(new long[] {-1, 6, -8, 5}, new long[] {1, 2, 5, 14});
  }
}
