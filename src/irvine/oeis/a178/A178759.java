package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178759 Expansion of e.g.f. 3*x*exp(x)*(exp(x)-1)^2.
 * @author Sean A. Irvine
 */
public class A178759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178759() {
    super(new long[] {-36, 132, -193, 144, -58, 12}, new long[] {0, 0, 0, 18, 144, 750});
  }
}
