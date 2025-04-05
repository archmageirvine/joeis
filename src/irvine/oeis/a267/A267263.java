package irvine.oeis.a267;
// manually 2025-04-04

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A267263 Number of nonzero digits in representation of n in primorial base.
 * @author Georg Fischer
 */
public class A267263 extends LambdaSequence implements DirectSequence {

  /** Construct the sequence. */
  public A267263() {
    super(0, n -> Functions.OMEGA.z(Functions.PRIMORIAL_BASE_EXP.z(n)));
  }

  @Override
  public Z a(final Z n) {
    return Functions.OMEGA.z(Functions.PRIMORIAL_BASE_EXP.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.OMEGA.z(Functions.PRIMORIAL_BASE_EXP.z(n));
  }

}
