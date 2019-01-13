package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017476.
 * @author Sean A. Irvine
 */
public class A017476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017476() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2401, 104976, 707281, 2560000, 6765201});
  }
}
