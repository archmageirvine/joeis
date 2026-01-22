package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392519 Numbers k such that sigma(k) = psi(k) + tau(k)^4 + omega(k).
 * @author Sean A. Irvine
 */
public class A392519 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392519() {
    super(1, 5188, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).pow(4)).add(Functions.OMEGA.z(k))));
  }
}
