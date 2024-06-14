package irvine.oeis.a276;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A276085 Primorial base log-function: a(1) = 0, a(n) = (e1*A002110(i1-1) + ... + ez*A002110(iz-1)) for n = prime(i1)^e1 * ... * prime(iz)^ez, where prime(k) is the k-th prime, A000040(k) and A002110(k) (the k-th primorial) is the product of first k primes.
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
