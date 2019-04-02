package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164037 Expansion of (5-9*x)/(1-6*x+7*x^2).
 * @author Sean A. Irvine
 */
public class A164037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164037() {
    super(new long[] {-7, 6}, new long[] {5, 21});
  }
}
