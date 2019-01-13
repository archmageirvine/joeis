package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175798.
 * @author Sean A. Irvine
 */
public class A175798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175798() {
    super(new long[] {1, -2, -1, 4, -1, -3, 2, 1}, new long[] {3, 2, 4, 2, 4, 3, 5, 6});
  }
}
