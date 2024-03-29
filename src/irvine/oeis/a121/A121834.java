package irvine.oeis.a121;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-24 19:57

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001912;

/**
 * A121834 Primes p of the form 4*n^2 + 1 such that 4*p^2+1 is also prime.
 * @author Georg Fischer
 */
public class A121834 extends IntersectionSequence {

  /** Construct the sequence. */
  public A121834() {
    super(new A001912(), new A121326());
  }
}
