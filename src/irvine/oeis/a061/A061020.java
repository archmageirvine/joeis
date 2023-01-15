package irvine.oeis.a061;

import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A061020 Negate primes in factorizations of divisors of n, then sum.
 * @author Sean A. Irvine
 */
public class A061020 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A061020() {
    super(new A061019(), 0);
    next();
  }
}

