package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108520 Expansion of 1/(1+2*x+2*x^2).
 * @author Sean A. Irvine
 */
public class A108520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108520() {
    super(new long[] {-2, -2}, new long[] {1, -2});
  }
}
