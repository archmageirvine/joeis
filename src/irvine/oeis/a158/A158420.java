package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158420.
 * @author Sean A. Irvine
 */
public class A158420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158420() {
    super(new long[] {1, -3, 3}, new long[] {1022, 4092, 9210});
  }
}
