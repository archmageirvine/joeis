package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164037 Expansion of <code>(5-9*x)/(1-6*x+7*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A164037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164037() {
    super(new long[] {-7, 6}, new long[] {5, 21});
  }
}
