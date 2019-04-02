package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074578 a(n) = 6^n + 7^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074578() {
    super(new long[] {378, -159, 22}, new long[] {3, 22, 166});
  }
}
