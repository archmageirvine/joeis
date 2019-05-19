package irvine.oeis.a000;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A000517 Number of permutations of length n with exactly three valleys.
 * @author Sean A. Irvine
 */
public class A000517 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A000517() {
    super(new long[] {272, -2944, 10176, -11520},
      new long[] {1, -40, 700, -7056, 45360, -194304, 561728, -1082624, 1332224, -946176, 294912});
  }
}
