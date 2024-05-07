package irvine.oeis.a069;

import irvine.oeis.NoncomputableSequence;

/**
 * A069575 Numbers n such that n contains the digit 0 in no base b with 2 &lt; b &lt; n.
 * @author Sean A. Irvine
 */
public class A069575 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A069575() {
    super(1, NONCOMPUTABLE, 4, 5, 7, 13, 23, 43, 157, 619);
  }
}
