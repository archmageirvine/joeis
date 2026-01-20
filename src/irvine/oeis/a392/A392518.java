package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A392518 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A392518 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A392518() {
    super(1, 148, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.SIGMA0.z(k).square()).add(Functions.OMEGA.z(k))));
  }
}
