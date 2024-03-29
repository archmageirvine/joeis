package irvine.oeis.a175;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.oeis.HypergeometricSequence;

/**
 * A175386 a(n) = denominator of sum((1/i)*C(2n-i-1,i-1),i=1..n).
 * @author Georg Fischer
 */
public class A175386 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A175386() {
    super(1, 2, 1, "[[1/2,-1],[0,-1],[1,-2],[-4]]", "", (n, v) -> v.subtract(1).divide(2L * n).den());
  }
}
