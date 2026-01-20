package irvine.oeis.a083;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001223;
import irvine.oeis.a080.A080374;

/**
 * A083273 a(n) is the quotient of lcm of first n consecutive prime differences and A001223(n), the n-th difference between consecutive primes.
 * @author Sean A. Irvine
 */
public class A083273 extends Combiner {

  /** Construct the sequence. */
  public A083273() {
    super(1, new A080374(), new A001223(), DIVIDE);
  }
}

