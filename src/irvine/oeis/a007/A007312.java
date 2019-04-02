package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A007312 Reversion of g.f. (with constant term omitted) for partition numbers.
 * @author Sean A. Irvine
 */
public class A007312 extends A000041 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = 0;
  {
    mP.add(Z.ZERO);
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    return RING.reversion(RING.create(mP), mN).coeff(mN);
  }
}

