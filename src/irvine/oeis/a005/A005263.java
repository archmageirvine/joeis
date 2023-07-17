package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A005263 Number of labeled Greg trees.
 * @author Sean A. Irvine
 */
public class A005263 extends A005264 {

  /** Construct the sequence. */
  public A005263() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private final List<Q> mB = new ArrayList<>();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Q.ZERO);
    } else {
      mF = mF.multiply(mN);
      mB.add(new Q(super.next(), mF));
    }
    final Polynomial<Q> b = RING.create(mB);
    return RING.subtract(RING.add(RING.one(), b), RING.pow(b, 2, mN)).coeff(mN).multiply(mF).toZ();
  }
}
