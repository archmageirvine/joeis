package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A005035 Number of nonequivalent dissections of a polygon into n quadrilaterals by nonintersecting diagonals rooted at a cell up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A005035 extends A001764 {

  /** Construct the sequence. */
  public A005035() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mU = new ArrayList<>();
  private int mN = -1;

  {
    mU.add(new Q(super.next()));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mU.add(new Q(super.next()));
    final Polynomial<Q> u = RING.create(mU);
    final Q a = RING.pow(u, 4, mN).coeff(mN);
    final Polynomial<Q> u2 = u.substitutePower(2);
    final Q b = RING.pow(u2, 2, mN).coeff(mN).multiply(3);
    final Q c = u.substitutePower(4).coeff(mN).multiply(2);
    final Polynomial<Q> den = RING.pow(RING.subtract(RING.one(), u2.shift(1)), 2, mN);
    final Q d = RING.coeff(u2, den, mN).multiply(2);
    return a.add(b).add(c).add(d).divide(8).toZ();
  }
}

