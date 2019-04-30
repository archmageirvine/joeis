package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237128 Angles n expressed in degrees such that <code>2*cos(n) =</code> phi where phi is the golden ratio (A001622).
 * @author Sean A. Irvine
 */
public class A237128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237128() {
    super(new long[] {-1, 1, 1}, new long[] {36, 324, 396});
  }
}
