package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078053 Expansion of (1-x)/(1+2*x-2*x^2-2*x^3).
 * @author Sean A. Irvine
 */
public class A078053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078053() {
    super(new long[] {2, 2, -2}, new long[] {1, -3, 8});
  }
}
