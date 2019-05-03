package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198309 Moore lower bound on the order of a <code>(9,g)-cage</code>.
 * @author Sean A. Irvine
 */
public class A198309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198309() {
    super(new long[] {-8, 8, 1}, new long[] {10, 18, 82});
  }
}
