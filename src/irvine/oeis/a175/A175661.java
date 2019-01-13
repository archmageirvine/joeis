package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175661.
 * @author Sean A. Irvine
 */
public class A175661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175661() {
    super(new long[] {-2, -1, 3}, new long[] {1, 5, 10});
  }
}
