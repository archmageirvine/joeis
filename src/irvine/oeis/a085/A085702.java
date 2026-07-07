package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A085702 Numbers k such that the sum of primes dividing k (with repetition) / smallest prime dividing k = largest prime dividing k.
 * @author Sean A. Irvine
 */
public class A085702 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085702() {
    super(1, k -> Functions.SOPFR.l(k) == Functions.GPF.l(k) * Functions.LPF.l(k));
  }
}
