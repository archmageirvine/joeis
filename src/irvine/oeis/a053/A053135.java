package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053135.
 * @author Sean A. Irvine
 */
public class A053135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053135() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 28, 210, 924, 3003, 8008, 18564});
  }
}
