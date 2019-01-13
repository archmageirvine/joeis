package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220989.
 * @author Sean A. Irvine
 */
public class A220989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220989() {
    super(new long[] {1728, -1884, 157}, new long[] {7, 1657, 247969});
  }
}
