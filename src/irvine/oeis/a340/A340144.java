package irvine.oeis.a340;
// Generated by gen_seq4.pl dirisqrt at 2024-01-11 23:33

import irvine.oeis.DirichletSquareRootSequence;
import irvine.oeis.a247.A247074;

/**
 * A340144 Numerators of the sequence whose Dirichlet convolution with itself yields sequence A247074(x) = phi(x)/(Product_{primes p dividing x} gcd(p-1, x-1)).
 * @author Georg Fischer
 */
public class A340144 extends DirichletSquareRootSequence {

  /** Construct the sequence. */
  public A340144() {
    super(1, new A247074(), NUM);
  }
}
