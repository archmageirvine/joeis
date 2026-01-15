package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392385 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A392385 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392385() {
    super(1, 27240, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k)).add(Functions.OMEGA.z(k).pow(7))));
  }
}
