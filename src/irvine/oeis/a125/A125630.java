package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125630 <code>a(n)</code> is the number of integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit 1 and at least one of digits 2,3,4,5,6,7,8,9.
 * @author Sean A. Irvine
 */
public class A125630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125630() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {9, 81, 729, 6561, 59049, 531441, 4782969, 43006401});
  }
}
