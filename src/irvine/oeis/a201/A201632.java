package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201632.
 * @author Sean A. Irvine
 */
public class A201632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201632() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {35, 83, 1203, 2835, 40883});
  }
}
