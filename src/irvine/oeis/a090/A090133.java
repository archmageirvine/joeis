package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090133 Expansion of <code>(1+4x)/(1+4x+5x^2)</code>.
 * @author Sean A. Irvine
 */
public class A090133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090133() {
    super(new long[] {-5, -4}, new long[] {1, 0});
  }
}
