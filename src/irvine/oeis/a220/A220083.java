package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220083.
 * @author Sean A. Irvine
 */
public class A220083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220083() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 40});
  }
}
