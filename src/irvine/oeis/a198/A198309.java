package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198309 Moore lower bound on the order of a (9,g)-cage.
 * @author Sean A. Irvine
 */
public class A198309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198309() {
    super(3, new long[] {-8, 8, 1}, new long[] {10, 18, 82});
  }
}
