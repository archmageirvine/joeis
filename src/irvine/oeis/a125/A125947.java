package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125947 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks the digit 1, at least one of digits 2,3,4,5 and at least one of digits 6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125947() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 81, 729, 6513, 57369, 495921, 4194969});
  }
}
