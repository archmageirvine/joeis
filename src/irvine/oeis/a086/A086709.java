package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086709 Primes p such that p-1 and p+1 are both divisible by fourth powers.
 * @author Sean A. Irvine
 */
public class A086709 extends FilterSequence {

  /** Construct the sequence. */
  public A086709() {
    super(1, new A000040(), p -> Jaguar.factor(p.subtract(1)).maxExponent() >= 4 && Jaguar.factor(p.add(1)).maxExponent() >= 4);
  }
}

