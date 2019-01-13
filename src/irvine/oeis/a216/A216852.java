package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216852.
 * @author Sean A. Irvine
 */
public class A216852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216852() {
    super(new long[] {1, -2, 0, 2}, new long[] {9, 9, -9, 9});
  }
}
