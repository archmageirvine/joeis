package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001158;

/**
 * A063784 Primes that are the sum of cubes of divisors of an integer.
 * @author Sean A. Irvine
 */
public class A063784 extends FilterSequence {

  /** Construct the sequence. */
  public A063784() {
    super(1, new A001158(), Z::isProbablePrime);
  }
}
