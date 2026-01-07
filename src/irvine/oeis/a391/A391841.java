package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a046.A046951;

/**
 * A391841 Positive integers k with exactly sqrt(tau(k)) square divisors.
 * @author Sean A. Irvine
 */
public class A391841 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A391841() {
    super(1, 1, new A046951(), (n, k) -> k.square().equals(Functions.SIGMA0.z(n)));
  }
}
