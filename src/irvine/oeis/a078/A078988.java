package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078988 Chebyshev sequence with Diophantine property.
 * @author Sean A. Irvine
 */
public class A078988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078988() {
    super(new long[] {-1, 66}, new long[] {1, 65});
  }
}
