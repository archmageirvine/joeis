package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190577.
 * @author Sean A. Irvine
 */
public class A190577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190577() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {105, 384, 945, 1920, 3465});
  }
}
