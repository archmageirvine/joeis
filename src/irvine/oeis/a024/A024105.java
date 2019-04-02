package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024105 a(n) = 9^n - n^4.
 * @author Sean A. Irvine
 */
public class A024105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024105() {
    super(new long[] {-9, 46, -95, 100, -55, 14}, new long[] {1, 8, 65, 648, 6305, 58424});
  }
}
