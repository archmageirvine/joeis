package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175287.
 * @author Sean A. Irvine
 */
public class A175287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175287() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 2, 5, 9});
  }
}
