package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248800 <code>n^2 + 3/2 + (1/2)*(-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A248800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248800() {
    super(new long[] {1, -2, 0, 2}, new long[] {2, 2, 6, 10});
  }
}
