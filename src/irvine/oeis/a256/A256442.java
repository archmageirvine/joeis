package irvine.oeis.a256;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.oeis.HypergeometricSequence;

/**
 * A256442 Denominators of sqrt(2) * Integral_{x=0..sqrt(1/3)} 1/(1-x^2)^(n+3/2) dx.
 * @author Georg Fischer
 */
public class A256442 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A256442() {
    super(0, 2, 1, "[[0,-1],[1/2],[3/2],[-1/2]]", "", (n, v) -> v.den());
  }
}
