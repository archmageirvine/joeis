package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216710 Expansion of <code>(1-3*x+x^2)^2/(1-9*x+28*x^2-35*x^3+15*x^4-x^5)</code>.
 * @author Sean A. Irvine
 */
public class A216710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216710() {
    super(new long[] {1, -15, 35, -28, 9}, new long[] {1, 3, 10, 35, 126});
  }
}
