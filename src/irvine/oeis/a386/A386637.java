package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A386637 Numbers k such that sigma(k) = psi(k) + tau(k) + omega(k).
 * @author Sean A. Irvine
 */
public class A386637 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A386637() {
    super(1, 28, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k)).add(Functions.OMEGA.z(k))));
  }
}
