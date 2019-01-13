package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186947.
 * @author Sean A. Irvine
 */
public class A186947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186947() {
    super(new long[] {16, -20, 8}, new long[] {1, 2, 8});
  }
}
