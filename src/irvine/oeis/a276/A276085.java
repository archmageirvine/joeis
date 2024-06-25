package irvine.oeis.a276;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A276085 Primorial base log-function: fully additive with a(p) = p#/p, where p# = A034386(p).
 * @author Georg Fischer
 */
public class A276085 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A276085() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIMORIAL_BASE_LOG.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIMORIAL_BASE_LOG.z(n);
  }

  @Override
  public Z next() {
    return Functions.PRIMORIAL_BASE_LOG.z(++mN);
  }
}
