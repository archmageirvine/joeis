package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138231 <code>A009545</code> alternated with its first differences.
 * @author Sean A. Irvine
 */
public class A138231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138231() {
    super(new long[] {-2, 0, 2, 0}, new long[] {0, 1, 1, 1});
  }
}
