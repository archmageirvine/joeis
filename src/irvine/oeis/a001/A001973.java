package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001973 Expansion of <code>(1+x^3)/((1-x)*(1-x^2)^2*(1-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A001973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001973() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {1, 1, 3, 5, 8, 12, 18});
  }
}
