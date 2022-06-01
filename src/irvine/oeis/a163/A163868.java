package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163868 a(n) = (4^n + 11)/3.
 * @author Sean A. Irvine
 */
public class A163868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163868() {
    super(new long[] {-4, 5}, new long[] {4, 5});
  }
}
