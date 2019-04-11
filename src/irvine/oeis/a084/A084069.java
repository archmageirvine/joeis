package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084069 Numbers n such that <code>7*n^2 =</code> floor(n*sqrt(7)*ceil(n*sqrt(7))).
 * @author Sean A. Irvine
 */
public class A084069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084069() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 3, 17, 48});
  }
}
