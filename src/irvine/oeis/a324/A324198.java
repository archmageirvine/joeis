package irvine.oeis.a324;
// manually 2025-04-01 direct

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A324198 a(n) = gcd(n, A276086(n)), where A276086 is the primorial base exp-function.
 * @author Georg Fischer
 */
public class A324198 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A324198() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return Functions.GCD.z(n, Functions.PRIMORIAL_BASE_EXP.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.GCD.z(n, Functions.PRIMORIAL_BASE_EXP.z(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
