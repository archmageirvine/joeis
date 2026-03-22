package irvine.oeis.a349;
// manually 2026-03-21

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A349394 a(p^e) = p^(e-1) for prime powers, a(n) = 0 for all other n; Dirichlet convolution of A003415 (arithmetic derivative of n) with A055615 (Dirichlet inverse of n).
 * @author Georg Fischer
 */
public class A349394 extends AbstractSequence implements DirectSequence {

  private long mN;

  /** Construct the sequence. */
  public A349394() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.isProbablePrime()) {
      return Z.ONE;
    }
    final Z t = n.isPower();
    if (t != null && t.isProbablePrime()) {
      return n.divide(t);
    }
    return Z.ZERO;
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

}
