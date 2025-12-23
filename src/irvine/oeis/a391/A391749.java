package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A391749 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A391749 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391749() {
    super(1, 112, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(3))));
  }
}
