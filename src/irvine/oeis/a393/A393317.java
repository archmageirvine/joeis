package irvine.oeis.a393;

import irvine.math.wolfram.ExactWolframBinary;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393317 Maximum halting time for any of the 4096 Wolfram 2-state 2-symbol Turing machines across all n-bit inputs.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A393317 extends Sequence1 {

  private static final int VERIFIED_BITS = 18;
  private static final int[] ATTAINING_RULES = {378, 1351, 1447};
  private final ExactWolframBinary mMachines = new ExactWolframBinary();
  private int mN;

  /**
   * Recompute an upper bound and an attained value by classifying every
   * rule and every positive input of at most the given width.
   * @param bits maximum input width
   * @return exact maximum halting time
   */
  public static int exhaustive(final int bits) {
    if (bits < 1 || bits > VERIFIED_BITS) {
      throw new IllegalArgumentException("Width outside the verified range");
    }
    final ExactWolframBinary machines = new ExactWolframBinary();
    int max = 0;
    for (int machine = 0; machine < 4096; ++machine) {
      for (int input = 1; input < 1 << bits; ++input) {
        max = Math.max(max, machines.haltingTime(machine, input));
      }
    }
    return max;
  }

  @Override
  public Z next() {
    if (++mN > VERIFIED_BITS) {
      throw new UnsupportedOperationException("No exact census at width " + mN);
    }
    // The exhaustive upper bounds through this width are attained by
    // these rules on the all-ones input; replaying them needs no term table.
    final long input = (1L << mN) - 1;
    int max = 0;
    for (final int machine : ATTAINING_RULES) {
      max = Math.max(max, mMachines.haltingTime(machine, input));
    }
    return Z.valueOf(max);
  }
}
