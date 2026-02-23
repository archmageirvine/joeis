package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A391384 Primes p such that p - 1 has exactly as many odd divisors as p + 1.
 * @author Sean A. Irvine
 */
public class A391384 extends FilterSequence {

  /** Construct the sequence. */
  public A391384() {
    super(1, new A000040(), p -> Functions.SIGMA0.z(p.multiply2().subtract(2)).add(Functions.SIGMA0.z(p.add(1))).equals(Functions.SIGMA0.z(p.multiply2().add(2)).add(Functions.SIGMA0.z(p.subtract(1)))));
  }
}
