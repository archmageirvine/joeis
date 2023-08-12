package irvine.oeis.a167;
// manually simgcd/simgcdp at 2023-08-12 11:15

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a137.A137873;

/**
 * A167840 Six-times-isolated primes: primes p such that none of p+-2, p+-4, p+-6, p+-8, p+-10 nor p+-12 are prime.
 * @author Georg Fischer
 */
public class A167840 extends PrependSequence {

  /** Construct the sequence. */
  public A167840() {
    super(1, new A137873() {
      @Override
      public Z next() {
        return super.next();
      }
    }, 2);
  }
}
