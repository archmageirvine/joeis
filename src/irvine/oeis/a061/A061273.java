package irvine.oeis.a061;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a040.A040014;

/**
 * A061273 Number of primes between successive powers of e (= 2.718281828...).
 * @author Sean A. Irvine
 */
public class A061273 extends DifferenceSequence {

  /** Construct the sequence. */
  public A061273() {
    super(new A040014());
  }
}
