package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A391763 Numbers k such that sigma(k) = psi(k) + phi(k) + omega(k)^4.
 * @author Sean A. Irvine
 */
public class A391763 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391763() {
    super(1, 2964, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(4))));
  }
}
