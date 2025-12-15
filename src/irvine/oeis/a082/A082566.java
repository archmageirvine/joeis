package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A082566 Primes p such that p, 2p+1, 4p+3 are palindromic primes.
 * @author Sean A. Irvine
 */
public class A082566 extends FilterSequence {

  /** Construct the sequence. */
  public A082566() {
    super(1, new A082520(), p -> {
      final Z sp = p.multiply(4).add(3);
      return Predicates.PALINDROME.is(sp) && Predicates.PRIME.is(sp);
    });
  }
}
