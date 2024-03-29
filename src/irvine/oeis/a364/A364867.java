package irvine.oeis.a364;
// Generated by gen_seq4.pl robots/union2 at 2023-08-23 09:55

import irvine.oeis.UnionSequence;
import irvine.oeis.a019.A019334;
import irvine.oeis.a105.A105875;

/**
 * A364867 Primes p such that the multiplicative order of 9 modulo p is (p-1)/2.
 * @author Georg Fischer
 */
public class A364867 extends UnionSequence {

  /** Construct the sequence. */
  public A364867() {
    super(1, new A019334(), new A105875());
    super.next();
  }
}
