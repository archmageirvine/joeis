package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248800.
 * @author Sean A. Irvine
 */
public class A248800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248800() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 2, 6, 10});
  }
}
