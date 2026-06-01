package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A394435 Primes p such that A001414(p-1)^2 + A001414(p+1)^2 is a perfect square, where A001414(n) is the sum of prime factors of n with multiplicity (sopfr).
 * @author Sean A. Irvine
 */
public class A394435 extends FilterSequence {

  /** Construct the sequence. */
  public A394435() {
    super(1, new A000040(), p -> Predicates.SQUARE.is(Functions.SOPFR.z(p.subtract(1)).square().add(Functions.SOPFR.z(p.add(1)).square())));
  }
}
