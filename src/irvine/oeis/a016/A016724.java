package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016724 Expansion of (2-2*x-x^2)/((1-2*x^2)*(1-x)^2).
 * @author Sean A. Irvine
 */
public class A016724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016724() {
    super(new long[] {2, -4, 1, 2}, new long[] {2, 2, 5, 4});
  }
}
