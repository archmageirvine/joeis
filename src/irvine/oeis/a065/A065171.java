package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065171 Permutation of Z, folded to N, corresponding to the site swap pattern <code>...26120123456.</code>.. which ascends infinitely after t=0.
 * @author Sean A. Irvine
 */
public class A065171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065171() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 4, 2, 8, 3, 12, 6, 16});
  }
}
