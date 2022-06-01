package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248340 10^n - 5^n.
 * @author Sean A. Irvine
 */
public class A248340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248340() {
    super(new long[] {-50, 15}, new long[] {0, 5});
  }
}
