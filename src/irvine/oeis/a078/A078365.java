package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078365 A Chebyshev T-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078365() {
    super(new long[] {-1, 15}, new long[] {2, 15});
  }
}
