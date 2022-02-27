package irvine.oeis.a054;

import irvine.oeis.NoncomputableSequence;

/**
 * A054871 a(n) = H_n(3,2) where H_n is the n-th hyperoperator.
 * @author Sean A. Irvine
 */
public class A054871 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A054871() {
    super(3, 5, 6, 9, 27, 7625597484987L);
  }
}
