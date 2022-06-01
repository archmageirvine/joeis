package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063757 G.f.: (1+3*x+2*x^2)/((1-x)*(1-2*x^2)).
 * @author Sean A. Irvine
 */
public class A063757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063757() {
    super(new long[] {-2, 2, 1}, new long[] {1, 4, 8});
  }
}
