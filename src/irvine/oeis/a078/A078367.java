package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078367 A Chebyshev T-sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078367() {
    super(new long[] {-1, 17}, new long[] {2, 17});
  }
}
