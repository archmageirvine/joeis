package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a007.A007253;

/**
 * A058204 McKay-Thompson series of class 10c for Monster.
 * @author Sean A. Irvine
 */
public class A058204 extends A007253 {

  /** Construct the sequence. */
  public A058204() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    final Q t = new Q(super.next());
    mA.add(++mN == 1 ? t.subtract(Q.FOUR) : t);
    return RING.sqrt(mA, mN).coeff(mN).toZ();
  }
}

