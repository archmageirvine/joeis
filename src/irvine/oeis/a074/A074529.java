package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074529 a(n) = 2^n + 3^n + 7^n.
 * @author Sean A. Irvine
 */
public class A074529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074529() {
    super(new long[] {42, -41, 12}, new long[] {3, 12, 62});
  }
}
