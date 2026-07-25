package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A086119 Numbers of the form p^3 + q^3, p, q primes.
 * @author Sean A. Irvine
 */
public class A086119 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A086119() {
    super(1, 1, 1, (x, y) -> Functions.PRIME.z(x).pow(3).add(Functions.PRIME.z(y).pow(3)));
  }
}

