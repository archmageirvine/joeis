package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198306 Moore lower bound on the order of a (6,g)-cage.
 * @author Sean A. Irvine
 */
public class A198306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198306() {
    super(new long[] {-5, 5, 1}, new long[] {7, 12, 37});
  }
}
