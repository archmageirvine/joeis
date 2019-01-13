package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167575.
 * @author Sean A. Irvine
 */
public class A167575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167575() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1473, 8169, 26529, 66345, 140865});
  }
}
