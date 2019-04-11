package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125910 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit 1, at least one of digits 2,3,4 and at least one of digits 5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125910() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 81, 723, 6381, 55539, 475461, 3993243});
  }
}
