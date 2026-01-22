package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392520 Numbers k such that sigma(k) = psi(k) + tau(k)^2 + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A392520 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392520() {
    super(1, 172, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).square()).add(Functions.OMEGA.z(k).pow(3))));
  }
}
