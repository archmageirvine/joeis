package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099460 A Chebyshev transform of A099459 associated to the knot 9_48.
 * @author Sean A. Irvine
 */
public class A099460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099460() {
    super(new long[] {-1, 7, -11, 7}, new long[] {1, 7, 39, 203});
  }
}
