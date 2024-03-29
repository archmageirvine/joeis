package irvine.oeis.a204;
// Generated by gen_seq4.pl 2024-03-14g/filter at 2024-03-14 21:15

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A204668 Primes p such that q-p = 58, where q is the next prime after p.
 * @author Georg Fischer
 */
public class A204668 extends FilterSequence {

  /** Construct the sequence. */
  public A204668() {
    super(1, new A000040(), v -> Puma.nextPrimeZ(v).subtract(v).equals(Z.valueOf(58)));
  }
}
