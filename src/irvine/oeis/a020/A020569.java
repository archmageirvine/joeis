package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020569 Expansion of g.f. 1/((1 - 5*x)*(1 - 11*x)*(1 - 12*x)).
 * @author Sean A. Irvine
 */
public class A020569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020569() {
    super(new long[] {660, -247, 28}, new long[] {1, 28, 537});
  }
}
