package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164559 a(n) = 6^n/3 - 1.
 * @author Sean A. Irvine
 */
public class A164559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164559() {
    super(new long[] {-6, 7}, new long[] {1, 11});
  }
}
