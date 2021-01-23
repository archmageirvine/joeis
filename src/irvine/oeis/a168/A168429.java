package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168429 a(n) = 4^n mod 11.
 * @author Sean A. Irvine
 */
public class A168429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168429() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 4, 5, 9, 3});
  }
}
