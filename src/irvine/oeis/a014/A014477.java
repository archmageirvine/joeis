package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014477 Expansion of (1 + 2*x)/(1 - 2*x)^3.
 * @author Sean A. Irvine
 */
public class A014477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014477() {
    super(new long[] {8, -12, 6}, new long[] {1, 8, 36});
  }
}
