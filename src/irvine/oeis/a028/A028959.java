package irvine.oeis.a028;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000122;
import irvine.oeis.a010.A010054;

/**
 * A028959 Theta series of quadratic form with Gram matrix <code>[ 2, 1; 1, 12 ]</code>.
 * @author Sean A. Irvine
 */
public class A028959 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemorySequence mPhi = MemorySequence.cachedSequence(new A000122());
  private final MemorySequence mPsi = MemorySequence.cachedSequence(new A010054());
  private int mN = -1;

  @Override
  public Z next() {
    mPhi.next();
    mPsi.next();
    final Polynomial<Z> phi = RING.create(mPhi);
    final Polynomial<Z> psi = RING.create(mPsi);
    ++mN;
    final Polynomial<Z> a = RING.multiply(phi, phi.substitutePower(23, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(psi.substitutePower(2, mN), psi.substitutePower(46, mN), mN), Z.FOUR).shift(6);
    return a.coeff(mN).add(b.coeff(mN));
  }
}

