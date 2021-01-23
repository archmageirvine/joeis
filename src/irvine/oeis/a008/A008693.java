package irvine.oeis.a008;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008693 Theta series of Niemeier lattice of type D_8^3.
 * @author Sean A. Irvine
 */
public class A008693 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private final ArrayList<Z> mE4 = new ArrayList<>();
  private final ArrayList<Z> mE6 = new ArrayList<>();

  @Override
  public Z next() {
    ++mN;
    mE4.add(mN == 0 ? Z.ONE : Cheetah.factor(mN).sigma(3).multiply(240));
    mE6.add(mN == 0 ? Z.ONE : Cheetah.factor(mN).sigma(5).multiply(-504));
    final Polynomial<Z> e4 = RING.pow(RING.create(mE4), 3, mN);
    final Polynomial<Z> e6 = RING.pow(RING.create(mE6), 2, mN);
    return e4.coeff(mN).multiply(7).add(e6.coeff(mN).multiply(2)).divide(9);
  }
}
