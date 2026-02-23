package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A393229 Numbers k such that sigma(k) = psi(k) + phi(k) + Omega(k)^2.
 * @author Sean A. Irvine
 */
public class A393229 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393229() {
    super(1, 200, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.BIG_OMEGA.z(k).square())));
  }
}
