package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A393528 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A393528 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393528() {
    super(1, 270760, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.BIG_OMEGA.z(k).pow(6))));
  }
}
