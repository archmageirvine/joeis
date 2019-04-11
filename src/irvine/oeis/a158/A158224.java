package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158224 <code>a(n) = 196*n^2 - 2*n</code>.
 * @author Sean A. Irvine
 */
public class A158224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158224() {
    super(new long[] {1, -3, 3}, new long[] {194, 780, 1758});
  }
}
