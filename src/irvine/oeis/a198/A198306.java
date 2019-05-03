package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198306 Moore lower bound on the order of a <code>(6,g)-cage</code>.
 * @author Sean A. Irvine
 */
public class A198306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198306() {
    super(new long[] {-5, 5, 1}, new long[] {7, 12, 37});
  }
}
