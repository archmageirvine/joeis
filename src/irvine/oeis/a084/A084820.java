package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A084820 Numbers n such that n, sigma(n) and phi(n) form an integer triangle, where sigma=A000203 is the divisor sum and phi=A000010 the totient.
 * @author Sean A. Irvine
 */
public class A084820 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084820() {
    super(1, k -> Functions.PHI.z(k).add(k).compareTo(Functions.SIGMA1.z(k)) > 0);
  }
}
