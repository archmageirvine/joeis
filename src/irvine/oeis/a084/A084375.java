package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.a051.A051362;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084375 Indices of primes which remain prime if any one digit is deleted (leading zeros allowed).
 * @author Sean A. Irvine
 */
public class A084375 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084375() {
    super(1, new A051362(), Functions.PRIME_PI::z);
  }
}
