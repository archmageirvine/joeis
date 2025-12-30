package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A391908 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A391908 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A391908() {
    super(1, 1984, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(5))));
  }
}
