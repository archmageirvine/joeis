package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000055;

/**
 * A006802 Log of e.g.f. for trees A000055(n-1).
 * @author Sean A. Irvine
 */
public class A006802 extends A000055 {

  /** Construct the sequence. */
  public A006802() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mA55 = new ArrayList<>();
  private Z mF = Z.ONE;

  private int mN = 0;

  {
    mA55.add(Q.ZERO);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA55.add(new Q(super.next(), mF));
    return RING.log1p(RING.create(mA55), mN).coeff(mN).multiply(mF).toZ();
  }
}
