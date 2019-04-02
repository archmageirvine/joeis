package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015559 Expansion of x/(1 - 7*x - 3*x^2).
 * @author Sean A. Irvine
 */
public class A015559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015559() {
    super(new long[] {3, 7}, new long[] {0, 1});
  }
}
