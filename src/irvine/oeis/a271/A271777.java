package irvine.oeis.a271;
// manually at 2022-08-15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A271777 a(n) = Sum_{k=1..n} ((-1)^(n-k) * k / ((n+1)^2 + (k-1)*(n+1))) * binomial(n+1, k+1) * binomial(n+k, k)^2.
 * @author Georg Fischer
 */
public class A271777 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A271777() {
    super(0, "[[0],[-72, 174,-143, 46,-5],[-504, 1194,-1043, 396,-55],[0,-22, 43,-26, 5]]", "0, 1, 3", -1);
  }
}
