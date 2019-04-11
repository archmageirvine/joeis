package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099842 Expansion of <code>(1-x)/(1+6x-3x^2)</code>.
 * @author Sean A. Irvine
 */
public class A099842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099842() {
    super(new long[] {3, -6}, new long[] {1, -7});
  }
}
