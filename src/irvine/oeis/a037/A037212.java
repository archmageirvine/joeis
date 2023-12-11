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
 * A037212 Theta series of lattice A_2 tensor A_15+ (dimension 30, det 3^15, min. norm 4).
 * @author Sean A. Irvine
 */
public class A037212 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z Z90 = Z.valueOf(90);
  private static final Z Z1260 = Z.valueOf(1260);
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
    final Polynomial<Z> w = RING.add(RING.subtract(RING.pow(x, 15, mN),
      RING.multiply(RING.multiply(RING.pow(x, 9, mN), y, mN), Z90)),
      RING.multiply(RING.multiply(RING.pow(x, 3, mN), RING.pow(y, 2, mN), mN), Z1260));
    return w.coeff(mN);
  }
}
