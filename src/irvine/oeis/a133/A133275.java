package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133275 Numbers X such that <code>30*X^2-45</code> is a square.
 * @author Sean A. Irvine
 */
public class A133275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133275() {
    super(new long[] {-1, 22}, new long[] {3, 63});
  }
}
