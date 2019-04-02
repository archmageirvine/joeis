package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116826 Number of permutations of length n which avoid the patterns 2143, 2431, 3124.
 * @author Sean A. Irvine
 */
public class A116826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116826() {
    super(new long[] {-4, 19, -38, 41, -25, 8}, new long[] {1, 2, 6, 21, 73, 244});
  }
}
