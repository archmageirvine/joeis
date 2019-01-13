package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134171.
 * @author Sean A. Irvine
 */
public class A134171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134171() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 0, 27});
  }
}
