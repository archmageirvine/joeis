package irvine.oeis.a085;
// manually at 2022-08-15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A085375 a(n) = binomial(2*n+1, n+1)*binomial(n+4, 4).
 * @author Georg Fischer
 */
public class A085375 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A085375() {
    super(0, "[[0],[6,-10,-4],[0,-1, 1]]", "[1, 15]", -1);
  }
}
