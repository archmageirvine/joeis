package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074544 a(n) = 2^n + 7^n + 8^n.
 * @author Sean A. Irvine
 */
public class A074544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074544() {
    super(new long[] {112, -86, 17}, new long[] {3, 17, 117});
  }
}
