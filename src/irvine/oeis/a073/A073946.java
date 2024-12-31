package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A073946 Squares k such that k + pi(k) is a prime.
 * @author Sean A. Irvine
 */
public class A073946 extends FilterSequence {

  /** Construct the sequence. */
  public A073946() {
    super(1, new A000290(), k -> k.add(Functions.PRIME_PI.z(k)).isProbablePrime());
  }
}

