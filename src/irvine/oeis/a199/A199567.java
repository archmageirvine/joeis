package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199567 a(n) = 7*9^n + 1.
 * @author Sean A. Irvine
 */
public class A199567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199567() {
    super(new long[] {-9, 10}, new long[] {8, 64});
  }
}
