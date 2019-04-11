package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178945 Expansion of <code>x*(1-x)^2/( (1-2*x^2)*(1-2*x)^2)</code>.
 * @author Sean A. Irvine
 */
public class A178945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178945() {
    super(new long[] {8, -8, -2, 4}, new long[] {1, 2, 7, 16});
  }
}
