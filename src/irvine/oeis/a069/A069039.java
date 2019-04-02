package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069039 Expansion of x(1+x)^5/(1-x)^7.
 * @author Sean A. Irvine
 */
public class A069039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069039() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 12, 73, 304, 985, 2668});
  }
}
