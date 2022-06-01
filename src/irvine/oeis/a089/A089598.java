package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089598 G.f.: (1+x^2+x^3)/(1-x^3)^2.
 * @author Sean A. Irvine
 */
public class A089598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089598() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 0, 1, 3, 0, 2});
  }
}
