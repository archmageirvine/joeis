package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A390847 Numbers k such that sigma(k) = psi(k) + phi(k) + omega(k)^10.
 * @author Sean A. Irvine
 */
public class A390847 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A390847() {
    super(1, 3818000, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(10))));
  }
}
