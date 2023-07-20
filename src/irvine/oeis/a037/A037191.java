package irvine.oeis.a037;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.a007.A007332;

/**
 * A037191 Theta series of lattice A_2 tensor E_7^2+ (dimension 28, min norm 4).
 * @author Sean A. Irvine
 */
public class A037191 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z Z84 = Z.valueOf(84);
  private static final Z Z1008 = Z.valueOf(1008);
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
    final Polynomial<Z> w = RING.add(RING.subtract(RING.pow(x, 14, mN),
      RING.multiply(RING.multiply(RING.pow(x, 8, mN), y, mN), Z84)),
      RING.multiply(RING.multiply(RING.pow(x, 2, mN), RING.pow(y, 2, mN), mN), Z1008));
    return w.coeff(mN);
  }
}
