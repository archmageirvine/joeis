package irvine.oeis.a317;
// Generated by gen_seq4.pl hypergeon at 2023-11-10 15:47

import irvine.math.function.Functions;
import irvine.oeis.HypergeometricSequence;

/**
 * A317279 a(n) = Sum_{k=0..n} (-1)^(n-k)*binomial(n-1,k-1)*n^k*n!/k!.
 * @author Georg Fischer
 */
public class A317279 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A317279() {
    super(0, 1, 1, "[[1,-1],[2],[0, 1]]", "1", (n, v) -> v.multiply(n).multiply(((n & 1) == 1) ? 1 : -1).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
