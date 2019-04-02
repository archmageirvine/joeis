package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126644 a(n) is the number of integers k less than 10^n such that the decimal representation of k lacks the digits 1,2,3,4,5,6 and at least one of digits 7,8,9.
 * @author Sean A. Irvine
 */
public class A126644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126644() {
    super(new long[] {6, -11, 6}, new long[] {4, 16, 58});
  }
}
