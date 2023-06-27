package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126645 a(n) is the number of integers k less than 10^n such that the decimal representation of k lacks the digits 1,2,3,4 and 5, at least one of digits 6,7 and at least one of digits 8,9.
 * @author Sean A. Irvine
 */
public class A126645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126645() {
    super(1, new long[] {6, -11, 6}, new long[] {5, 21, 77});
  }
}
