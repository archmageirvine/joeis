package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A086708 Primes p such that p-1 and p+1 are both divisible by cubes (other than 1).
 * @author Sean A. Irvine
 */
public class A086708 extends FilterSequence {

  /** Construct the sequence. */
  public A086708() {
    super(1, new A000040(), p -> Jaguar.factor(p.subtract(1)).maxExponent() >= 3 && Jaguar.factor(p.add(1)).maxExponent() >= 3);
  }
}

