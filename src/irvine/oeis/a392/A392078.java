package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392078 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A392078 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392078() {
    super(1, 786120, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(9))));
  }
}
