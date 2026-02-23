package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A393230 Numbers k such that sigma(k) = psi(k) + phi(k) + Omega(k)^3.
 * @author Sean A. Irvine
 */
public class A393230 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393230() {
    super(1, 2288, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.BIG_OMEGA.z(k).pow(3))));
  }
}
