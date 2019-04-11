package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074508 <code>1^n + 3^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074508() {
    super(new long[] {18, -27, 10}, new long[] {3, 10, 46});
  }
}
