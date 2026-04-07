package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A394569 Numbers k such that gcd(k, Omega(k)) is prime.
 * @author Sean A. Irvine
 */
public class A394569 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394569() {
    super(1, k -> Functions.GCD.z(k, Functions.BIG_OMEGA.l(k)).isProbablePrime());
  }
}
