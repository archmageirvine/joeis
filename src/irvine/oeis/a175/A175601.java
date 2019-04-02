package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175601 7*(10^n-9).
 * @author Sean A. Irvine
 */
public class A175601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175601() {
    super(new long[] {-10, 11}, new long[] {7, 637});
  }
}
