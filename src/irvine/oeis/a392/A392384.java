package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392384 Numbers k such that sigma(k) = psi(k) + tau(k) + omega(k)^6.
 * @author Sean A. Irvine
 */
public class A392384 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392384() {
    super(1, 184, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k)).add(Functions.OMEGA.z(k).pow(6))));
  }
}
