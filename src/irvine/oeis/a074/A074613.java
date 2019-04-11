package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074613 <code>a(n) = 4^n + 7^n</code>.
 * @author Sean A. Irvine
 */
public class A074613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074613() {
    super(new long[] {-28, 11}, new long[] {2, 11});
  }
}
