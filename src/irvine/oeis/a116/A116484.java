package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116484 Expansion of (-1+3*x)/(5*x^2 + 1 - 2*x).
 * @author Sean A. Irvine
 */
public class A116484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116484() {
    super(new long[] {-5, 2}, new long[] {-1, 1});
  }
}
