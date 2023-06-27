package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126635 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks the digits 1,2,3, at least one of digits 4,5 and at least one of digits 6,7,8,9.
 * @author Sean A. Irvine
 */
public class A126635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126635() {
    super(1, new long[] {120, -274, 225, -85, 15}, new long[] {7, 47, 307, 1943, 11827});
  }
}
