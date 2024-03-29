package irvine.oeis.a075;
// Generated by gen_seq4.pl insect/union2 at 2022-02-24 19:57

import irvine.oeis.UnionSequence;
import irvine.oeis.a039.A039787;
import irvine.oeis.a049.A049097;

/**
 * A075430 Primes with a squarefree neighbor.
 * @author Georg Fischer
 */
public class A075430 extends UnionSequence {

  /** Construct the sequence. */
  public A075430() {
    super(new A039787(), new A049097());
  }
}
