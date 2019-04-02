package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074557 3^n + 6^n + 9^n.
 * @author Sean A. Irvine
 */
public class A074557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074557() {
    super(new long[] {162, -99, 18}, new long[] {3, 18, 126});
  }
}
