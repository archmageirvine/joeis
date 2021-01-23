package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087169 Expansion of (1 + 3*x)/(1 + 5*x + 9*x^2).
 * @author Sean A. Irvine
 */
public class A087169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087169() {
    super(new long[] {-9, -5}, new long[] {1, -2});
  }
}
