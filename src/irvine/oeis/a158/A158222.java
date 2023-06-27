package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158222 a(n) = 196*n^2 + 2*n.
 * @author Sean A. Irvine
 */
public class A158222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158222() {
    super(1, new long[] {1, -3, 3}, new long[] {198, 788, 1770});
  }
}
