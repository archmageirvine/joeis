package irvine.oeis.a004;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004675 Theta series of extremal even unimodular lattice in dimension 72.
 * @author Sean A. Irvine
 */
public class A004675 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z720 = Z.valueOf(720);

  private final A004009 mE8Seq = new A004009();
  private final List<Z> mE8 = new ArrayList<>();

  private Polynomial<Z> e8(final int degree) {
    while (degree >= mE8.size()) {
      mE8.add(mE8Seq.next());
      mE8.add(Z.ZERO);
    }
    return RING.create(mE8);
  }

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Z> e8 = e8(mN);
    final Polynomial<Z> delta24 = ThetaFunctions.delta24z2(mN);
    final Polynomial<Z> leech = RING.subtract(RING.pow(e8, 3, mN), RING.multiply(delta24, Z720));
    final Polynomial<Z> u1 = RING.pow(leech, 3, mN);
    final Polynomial<Z> delta24Square = RING.pow(delta24, 2, mN);
    final Polynomial<Z> u3 = RING.multiply(leech, delta24Square, mN);
    final Polynomial<Z> u4 = RING.multiply(delta24Square, delta24, mN);
    return u1.coeff(mN).subtract(u3.coeff(mN).multiply(589680)).subtract(u4.coeff(mN).multiply(78624000));
  }
}

