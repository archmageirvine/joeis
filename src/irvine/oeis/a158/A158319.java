package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158319 441n - 1.
 * @author Sean A. Irvine
 */
public class A158319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158319() {
    super(1, new long[] {-1, 2}, new long[] {440, 881});
  }
}
