package irvine.oeis.a037;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004009;
import irvine.oeis.a013.A013973;

/**
 * A037947 Coefficients of unique normalized cusp form Delta_26 of weight 26 for full modular group.
 * @author Sean A. Irvine
 */
public class A037947 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mE4Seq = new A004009();
  private final Sequence mE6Seq = new A013973();
  private final Polynomial<Z> mE4 = RING.empty();
  private final Polynomial<Z> mE6 = RING.empty();

  private int mN = -1;
  {
    next(); // skip 0
  }

  @Override
  public Z next() {
    ++mN;
    mE4.add(mE4Seq.next());
    mE6.add(mE6Seq.next());
    final Polynomial<Z> e42 = RING.pow(mE4, 2, mN);
    final Polynomial<Z> e43 = RING.multiply(mE4, e42, mN);
    final Polynomial<Z> e62 = RING.pow(mE6, 2, mN);
    return RING.multiply(RING.subtract(e43, e62), RING.multiply(e42, mE6, mN), mN).coeff(mN).divide(1728);
  }
}


