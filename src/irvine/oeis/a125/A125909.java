package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125909 a(n) is the number of nonnegative integers k less than 10^n such that the decimal representation of k lacks the digit 1, at least one of the digits 2,3 and at least one of digits 4,5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125909() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 79, 681, 5791, 48729, 405919, 3340521});
  }
}
