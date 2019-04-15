package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201106 <code>Binomial(n^2,3)/(2*n)</code>.
 * @author Sean A. Irvine
 */
public class A201106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201106() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 14, 70, 230, 595});
  }
}
