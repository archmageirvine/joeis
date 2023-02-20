package irvine.oeis.a137;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A137637 a(n) = Sum_{k=0..n} C(2k+2,k)*C(2k+2,n-k) ; equals row 2 of square array A137634 ; also equals the convolution of A137635 and the self-convolution of A073157.
 * @author Georg Fischer
 */
public class A137637 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A137637() {
    super(0, "[[0],[24,20,-42,18,-4],[46,-2,-102,54,-12],[-4,-92,-86,54,-12],[-32,-23,-29,15,-3],[-12,24,3,-4,1]]", "1", 0);
  }
}
