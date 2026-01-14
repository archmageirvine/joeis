package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392263 Numbers k such that sigma(k) = psi(k) + tau(k) + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A391447 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391447() {
    super(1, 80, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k)).add(Functions.OMEGA.z(k).pow(5))));
  }
}
