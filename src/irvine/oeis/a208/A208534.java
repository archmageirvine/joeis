package irvine.oeis.a208;
// manually 2026-07-18

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A208534 Number of n-bead necklaces of 7 colors not allowing reversal, with no adjacent beads having the same color.
 * @author Georg Fischer
 */
public class A208534 extends LambdaSequence {

  /** Construct the sequence. */
  public A208534() {
    super(1, n -> n == 1 ? Z.SEVEN : Integers.SINGLETON.sumdiv(n, d -> Functions.PHI.z(n / d).multiply(Z.NEG_ONE.pow(d).multiply(6).add(Z.SIX.pow(d)))).divide(n));
  }
}
