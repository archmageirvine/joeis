package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A393667 allocated for S. I. Dimitrov.
 * @author Sean A. Irvine
 */
public class A393704 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A393704() {
    super(1, 281926404, k -> Functions.SIGMA1.z(k).equals(Functions.DEDEKIND_PSI.z(k).add(Functions.PHI.z(k)).add(Functions.BIG_OMEGA.z(k).pow(10))));
  }
}
