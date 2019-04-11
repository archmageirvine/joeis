package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024101 <code>a(n) = 9^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024101() {
    super(new long[] {-9, 10}, new long[] {0, 8});
  }
}
