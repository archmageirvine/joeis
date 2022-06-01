package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091086 a(n) = A000975(n) mod 10.
 * @author Sean A. Irvine
 */
public class A091086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091086() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 2, 5});
  }
}
