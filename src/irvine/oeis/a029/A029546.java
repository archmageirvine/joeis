package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029546 Expansion of 1/(1 - 35*x + 35*x^2 - x^3).
 * @author Sean A. Irvine
 */
public class A029546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029546() {
    super(new long[] {1, -35, 35}, new long[] {1, 35, 1190});
  }
}
