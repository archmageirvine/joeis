package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A391448 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A391448 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391448() {
    super(1, 43960, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.BIG_OMEGA.z(k).pow(5))));
  }
}
