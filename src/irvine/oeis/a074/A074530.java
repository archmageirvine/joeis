package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074530 a(n) = 2^n + 3^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074530() {
    super(new long[] {48, -46, 13}, new long[] {3, 13, 77});
  }
}
