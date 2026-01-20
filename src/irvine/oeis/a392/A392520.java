package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392520 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A392520 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392520() {
    super(1, 172, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).square()).add(Functions.OMEGA.z(k).pow(3))));
  }
}
