package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104538 Expansion of (1 + 2*x) / (1 + 2*x + 4*x^2).
 * @author Sean A. Irvine
 */
public class A104538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104538() {
    super(new long[] {-4, -2}, new long[] {1, 0});
  }
}
