package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A007947 Largest squarefree number dividing n: the squarefree kernel of n, rad(n), radical of n.
 * @author Sean A. Irvine
 */
public class A007947 extends AbstractSequence implements DirectSequence {

  /** Construct the sequence. */
  public A007947() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z a(final int n) {
    return Functions.SQUARE_FREE_KERNEL.z(n);
  }

  @Override
  public Z a(final Z n) {
    return Functions.SQUARE_FREE_KERNEL.z(n);
  }

  @Override
  public Z next() {
    return Functions.SQUARE_FREE_KERNEL.z(++mN);
  }
}
