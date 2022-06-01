package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074613 a(n) = 4^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074613() {
    super(new long[] {-28, 11}, new long[] {2, 11});
  }
}
