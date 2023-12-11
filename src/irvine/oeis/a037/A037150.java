package irvine.oeis.a037;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;
import irvine.oeis.memory.MemorySequence;

/**
 * A037150 Fourier coefficients of Eisenstein series of degree 2 and weight 6 when evaluated at Gram(A_2)*z.
 * @author Sean A. Irvine
 */
public class A037150 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z Z72 = Z.valueOf(72);
  private static final Z Z1728 = Z.valueOf(1728);
  private final MemorySequence mPhi0 = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A004016(), 1));
  private final MemorySequence mDelta12 = MemorySequence.cachedSequence(new ZeroSpacedSequence(new A007332(), 1));
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    // Ensure sufficient parent terms
    mPhi0.a(mN);
    mDelta12.a(mN);
    final Polynomial<Z> x = mPhi0.polynomial();
    final Polynomial<Z> y = mDelta12.polynomial();
    final Polynomial<Z> w = RING.subtract(RING.subtract(RING.pow(x, 12, mN),
      RING.multiply(RING.multiply(RING.pow(x, 6, mN), y, mN), Z72)),
      RING.multiply(RING.pow(y, 2, mN), Z1728));
    return w.coeff(mN);
  }
}
