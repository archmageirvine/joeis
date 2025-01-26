package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A074731 Squares whose sum of anti-divisors is a cube.
 * @author Sean A. Irvine
 */
public class A074731 extends FilterSequence {

  /** Construct the sequence. */
  public A074731() {
    super(1, new A000290().skip(), k -> Predicates.CUBE.is(Functions.ANTISIGMA1.z(k)));
  }
}
