package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074546 a(n) = 2^n + 8^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074546() {
    super(new long[] {144, -106, 19}, new long[] {3, 19, 149});
  }
}
