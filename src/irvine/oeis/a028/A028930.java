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
 * A028930 Theta series of quadratic form (or lattice) with Gram matrix <code>[ 4, 1; 1, 6 ]</code>.
 * @author Sean A. Irvine
 */
public class A028930 implements Sequence {

  private final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
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
    final Polynomial<Z> a = RING.multiply(phi.substitutePower(2, mN), phi.substitutePower(46, mN), mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(psi, psi.substitutePower(23, mN), mN), Z.TWO).shift(3);
    final Polynomial<Z> c = RING.multiply(RING.multiply(psi.substitutePower(4, mN), psi.substitutePower(92, mN), mN), Z.FOUR).shift(12);
    //System.out.println(mN + " " + a.coeff(mN) + " " + b.coeff(mN) + " " + c.coeff(mN));
    return a.coeff(mN).add(b.coeff(mN)).add(c.coeff(mN));
  }
}

