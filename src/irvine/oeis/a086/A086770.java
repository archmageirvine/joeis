package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A086770 Numbers k such that the difference between the largest and the smallest prime divisor of k equals the number of prime divisors of k (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A086770 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086770() {
    super(1, k -> Functions.GPF.l(k) - Functions.LPF.l(k) == Functions.BIG_OMEGA.l(k));
  }
}
