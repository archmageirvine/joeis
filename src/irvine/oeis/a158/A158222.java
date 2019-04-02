package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158222 196n^2+2n.
 * @author Sean A. Irvine
 */
public class A158222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158222() {
    super(new long[] {1, -3, 3}, new long[] {198, 788, 1770});
  }
}
