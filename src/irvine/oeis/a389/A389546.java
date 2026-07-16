package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A389546 Numbers k such that sigma(k) = psi(k) + tau(k)^4.
 * @author Sean A. Irvine
 */
public class A389546 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A389546() {
    super(1, 72547, n -> Functions.SIGMA1.z(n).equals(Functions.DEDEKIND_PSI.z(n).add(Functions.SIGMA0.z(n).pow(4))));
  }
}
