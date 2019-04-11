package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085282 Expansion of <code>(1 - 5*x + 5*x^2)/((1-x)*(1-3*x)*(1-4*x))</code>.
 * @author Sean A. Irvine
 */
public class A085282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085282() {
    super(new long[] {12, -19, 8}, new long[] {1, 3, 10});
  }
}
