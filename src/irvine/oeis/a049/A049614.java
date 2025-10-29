package irvine.oeis.a049;
// manually 2025-10-27

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A049614 n! divided by its squarefree kernel.
 * @author Georg Fischer
 */
public class A049614 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.FACTORIAL.z(n).divide(Functions.PRIMORIAL.z(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.FACTORIAL.z(n).divide(Functions.PRIMORIAL.z(n));
  }

}
