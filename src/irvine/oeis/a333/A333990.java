package irvine.oeis.a333;

import irvine.oeis.HypergeometricSequence;

/**
 * A333990 a(n) = Sum_{k=0..n} n^k * binomial(2*n,2*k).
 * <code>a(n) = hypergeometric2F1(1/2 - n, -n, 1/2, n)</code>.
 * @author Georg Fischer
 */
public class A333990 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A333990() {
    super(0, 2, 1, "[[1/2,-1],[0,-1],[1/2],[0, 1]]");
  }
}
