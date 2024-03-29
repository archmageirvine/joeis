package irvine.oeis.a365;
// Generated by gen_seq4.pl multman/mult at 2023-10-03 19:56

import irvine.oeis.MultiplicativeSequence;

/**
 * A365649 Dirichlet convolution of sigma with Dedekind psi function.
 * Multiplicative with: a(p^e) = (2 + ((e+1)*p^2 - 2*p - e - 1)*p^e)/(p-1)^2.
 * @author Georg Fischer
 */
public class A365649 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A365649() {
    super(1, (p, e) -> p.pow(e).multiply(p.square().multiply(e + 1).subtract(p.multiply2()).add(-e - 1)).add(2).divide(p.subtract(1).square()));
  }
}
