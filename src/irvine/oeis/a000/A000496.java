package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;
import irvine.oeis.PrependSequence;

/**
 * A000496 Restricted permutations.
 * @author Sean A. Irvine
 */
public class A000496 extends PrependSequence {

  // Conjectured GF due to Plouffe

  /** Construct the sequence. */
  public A000496() {
    super(new GeneratingFunctionSequence(new long[] {24, -4, -8, -16, -4},
      new long[] {1, -2, 0, 0, 1}), Z.ONE, Z.ONE, Z.TWO, Z.SIX);
  }
}
