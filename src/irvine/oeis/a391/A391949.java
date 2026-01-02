package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A391949 Numbers k such that sigma(k) = psi(k) + phi(k) + omega(k)^6.
 * @author Sean A. Irvine
 */
public class A391949 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391949() {
    super(1, 48896, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(6))));
  }
}
