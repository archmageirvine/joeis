package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024101 a(n) = 9^n-1.
 * @author Sean A. Irvine
 */
public class A024101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024101() {
    super(new long[] {-9, 10}, new long[] {0, 8});
  }
}
