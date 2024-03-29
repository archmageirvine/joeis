package irvine.oeis.a336;
// Generated by gen_seq4.pl dirichcon at 2021-04-24 00:16
// DO NOT EDIT here!

import irvine.oeis.DirichletConvolutionSequence;
import irvine.oeis.a003.A003961;

/**
 * A336845 a(n) = A000005(n) * A003961(n), where A003961 is the prime shift towards larger primes, and A000005 gives the number of divisors of n, and also of A003961(n).
 * @author Georg Fischer
 */
public class A336845 extends DirichletConvolutionSequence {

  /** Construct the sequence. */
  public A336845() {
    super(new A003961(), 1);
  }
}
