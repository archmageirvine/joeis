package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126641 a(n) is the number of integers k less than 10^n such that the decimal representation of k lacks the digit 1, at least one of digits 2,3, at least one of digits 4,5, at least one of digits 6,7 and at least one of digits 8,9.
 * @author Sean A. Irvine
 */
public class A126641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126641() {
    super(new long[] {120, -274, 225, -85, 15}, new long[] {9, 73, 537, 3625, 22809});
  }
}
