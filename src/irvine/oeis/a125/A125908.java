package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125908 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digits 1 and 2 and at least one of digits 3,4,5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125908() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {8, 64, 512, 4096, 32768, 262144, 2092112});
  }
}
