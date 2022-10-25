package irvine.oeis.a082;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A082143 First subdiagonal of number array A082137.
 * @author Georg Fischer
 */
public class A082143 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A082143() {
    // 2^(n-1)*binomial(2*n+1, n)
    super(0, "[[0],[-4,-8],[1,1]]", "[1,3]", 0);
  }
}
