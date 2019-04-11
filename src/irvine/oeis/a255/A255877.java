package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255877 <code>a(n) = (2n-2)^3 +(2n-2) - 1</code>.
 * @author Sean A. Irvine
 */
public class A255877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255877() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 9, 67, 221});
  }
}
