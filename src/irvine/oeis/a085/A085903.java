package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085903 G.f.: (1 + 2*x^2)/((1 + x)*(1 - 2*x)*(1 - 2*x^2)).
 * @author Sean A. Irvine
 */
public class A085903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085903() {
    super(1, new long[] {-4, -2, 4, 1}, new long[] {1, 1, 7, 9});
  }
}
