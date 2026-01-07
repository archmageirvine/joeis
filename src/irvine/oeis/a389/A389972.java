package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A389972 Numbers k such that sigma(k) = psi(k) + phi(k) + omega(k)^7.
 * @author Sean A. Irvine
 */
public class A389972 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A389972() {
    super(1, 32512, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(7))));
  }
}
