package irvine.oeis.a073;

import irvine.oeis.FilterPositionSequence;

/**
 * A073319 Numbers n such that A073318(n) = 2^phi(n) - Sum_{j=0..n} binomial(phi(n), phi(j)) is positive.
 * @author Sean A. Irvine
 */
public class A073319 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073319() {
    super(1, 1, new A073318(), k -> k.signum() > 0);
  }
}

