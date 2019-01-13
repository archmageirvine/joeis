package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175899.
 * @author Sean A. Irvine
 */
public class A175899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175899() {
    super(new long[] {2, 1, 1, 0}, new long[] {0, 2, 3, 10});
  }
}
