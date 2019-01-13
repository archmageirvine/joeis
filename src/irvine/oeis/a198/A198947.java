package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198947.
 * @author Sean A. Irvine
 */
public class A198947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198947() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 7, 13, 139});
  }
}
