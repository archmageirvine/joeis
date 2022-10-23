package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004673 Theta series of extremal even unimodular lattice in dimension 56.
 * @author Sean A. Irvine
 */
public class A004673 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z A = Z.valueOf(1680);
  private static final Z B = Z.valueOf(347760);
  private int mN = -2;
  private final A004009 mThetaE8Seq = new A004009();
  private final ArrayList<Z> mThetaE8 = new ArrayList<>();

  @Override
  public Z next() {
    mN += 2;
    mThetaE8.add(mThetaE8Seq.next());
    mThetaE8.add(Z.ZERO);
    final Polynomial<Z> e8 = RING.create(mThetaE8);
    final Polynomial<Z> delta24 = ThetaFunctions.delta24z2(mN);
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.pow(e8, 4, mN), delta24, mN), A);
    final Polynomial<Z> b = RING.multiply(RING.multiply(e8, RING.pow(delta24, 2, mN), mN), B);
    return RING.add(RING.subtract(RING.pow(e8, 7, mN), a), b).coeff(mN);
  }
}
