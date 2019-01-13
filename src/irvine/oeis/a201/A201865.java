package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201865.
 * @author Sean A. Irvine
 */
public class A201865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201865() {
    super(new long[] {21, -4}, new long[] {1, -4});
  }
}
