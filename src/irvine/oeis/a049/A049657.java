package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049657.
 * @author Sean A. Irvine
 */
public class A049657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049657() {
    super(new long[] {1, -48, 48}, new long[] {0, 29, 1393});
  }
}
