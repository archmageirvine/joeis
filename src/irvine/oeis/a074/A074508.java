package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074508 1^n + 3^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074508() {
    super(new long[] {18, -27, 10}, new long[] {3, 10, 46});
  }
}
