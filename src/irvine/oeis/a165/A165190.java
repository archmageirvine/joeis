package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165190 G.f.: 1/((1-x^4)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A165190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165190() {
    super(new long[] {-1, 0, 0, 0, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 0, 0, 1});
  }
}
