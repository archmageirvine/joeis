package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A393666 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A393666 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393666() {
    super(1, 11769060, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.BIG_OMEGA.z(k).pow(8))));
  }
}
