package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278476.
 * @author Sean A. Irvine
 */
public class A278476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278476() {
    super(new long[] {-1, -13, 15}, new long[] {1, 14, 196});
  }
}
