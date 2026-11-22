package irvine.oeis.a386;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.a004.A004147;

/**
 * A386859 Sum of the number of steps taken by all n-state Turing machines that halt.
 * @author Gregory Morse
 */
public class A386859 extends A004147 {
  // Use the published fifth value; recompute the earlier terms.
  /** Construct the sequence. */
  public A386859() {
    super(64068865333248L);
  }

  @Override
  protected Z select(final BlankTapeHalting tally) {
    return tally.totalSteps();
  }
}
