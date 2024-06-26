package irvine.oeis.a293;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.math.function.Functions;
import irvine.oeis.HypergeometricSequence;

/**
 * A293145 a(n) = n! * [x^n] exp(n*x/(1 - x)).
 * @author Georg Fischer
 */
public class A293145 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A293145() {
    super(0, 1, 1, "[[1,-1],[2],[0,-1]]", "1", (n, v) -> v.multiply(n).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
