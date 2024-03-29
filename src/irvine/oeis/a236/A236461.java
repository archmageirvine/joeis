package irvine.oeis.a236;
// Generated by gen_seq4.pl insect/insect2 at 2022-02-22 19:20

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a001.A001043;
import irvine.oeis.a108.A108099;

/**
 * A236461 Sum of two consecutive primes that is also sum of two consecutive even positive squares.
 * @author Georg Fischer
 */
public class A236461 extends IntersectionSequence {

  /** Construct the sequence. */
  public A236461() {
    super(new A001043(), new A108099());
  }
}
