package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004671 Theta series of extremal even unimodular lattice in dimension 40.
 * @author Sean A. Irvine
 */
public class A004671 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z Z1200 = Z.valueOf(1200);
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
    final Polynomial<Z> a = RING.multiply(RING.multiply(RING.pow(e8, 2, mN), delta24, mN), Z1200);
    return RING.subtract(RING.pow(e8, 5, mN), a).coeff(mN);
  }
}
