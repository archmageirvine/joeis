package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193147 G.f.: <code>1/(1 - x - 2*x^3 - x^5)</code>.
 * @author Sean A. Irvine
 */
public class A193147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193147() {
    super(new long[] {1, 0, 2, 0, 1}, new long[] {1, 1, 1, 3, 5});
  }
}
