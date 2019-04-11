package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062508 <code>a(n) = 3^(2n)+7</code>.
 * @author Sean A. Irvine
 */
public class A062508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062508() {
    super(new long[] {-9, 10}, new long[] {8, 16});
  }
}
