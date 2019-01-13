package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030280.
 * @author Sean A. Irvine
 */
public class A030280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030280() {
    super(new long[] {1, -9, 39, -102, 174, -195, 139, -57, 12}, new long[] {1, 6, 30, 137, 588, 2415, 9600, 37209, 141336});
  }
}
