package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078363 A Chebyshev T-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078363() {
    super(new long[] {-1, 13}, new long[] {2, 13});
  }
}
