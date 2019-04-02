package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171753 Expansion of 1/(1-3x-x^2/(1-3x-x^2/(1-3x))).
 * @author Sean A. Irvine
 */
public class A171753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171753() {
    super(new long[] {21, -25, 9}, new long[] {1, 3, 10});
  }
}
