package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078362 A Chebyshev S-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078362() {
    super(new long[] {-1, 13}, new long[] {1, 13});
  }
}
