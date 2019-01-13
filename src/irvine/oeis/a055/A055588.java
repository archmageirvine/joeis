package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055588.
 * @author Sean A. Irvine
 */
public class A055588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055588() {
    super(new long[] {1, -4, 4}, new long[] {1, 2, 4});
  }
}
