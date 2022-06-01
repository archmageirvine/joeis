package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074525 a(n) = 1^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074525() {
    super(new long[] {72, -89, 18}, new long[] {3, 18, 146});
  }
}
