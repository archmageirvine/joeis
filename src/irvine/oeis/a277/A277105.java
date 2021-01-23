package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277105 a(n) = (27*3^n - 63)/2.
 * @author Sean A. Irvine
 */
public class A277105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277105() {
    super(new long[] {-3, 4}, new long[] {9, 90});
  }
}
