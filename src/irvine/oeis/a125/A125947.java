package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125947 <code>a(n)</code> is the number of nonnegative integers k less than <code>10^n</code> such that the decimal representation of k lacks the digit <code>1,</code> at least one of digits <code>2,3,4,5</code> and at least one of digits <code>6,7,8,9</code>.
 * @author Sean A. Irvine
 */
public class A125947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125947() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 81, 729, 6513, 57369, 495921, 4194969});
  }
}
