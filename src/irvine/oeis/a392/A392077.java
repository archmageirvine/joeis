package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392077 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A392077 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392077() {
    super(1, 1275924, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.OMEGA.z(k).pow(8))));
  }
}
