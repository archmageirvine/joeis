package irvine.oeis.a068;
// manually 2024-07-05

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A068311 Arithmetic derivative of n!.
 * @author Georg Fischer
 */
public class A068311 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A068311() {
    super(0);
    mN = -1;
  }

  @Override
  public Z a(final Z n) {
    return Functions.ARD.z(Functions.FACTORIAL.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.ARD.z(Functions.FACTORIAL.z(n));
  }

  @Override
  public Z next() {
    return Functions.ARD.z(Functions.FACTORIAL.z(++mN));
  }

}
