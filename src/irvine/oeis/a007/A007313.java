package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A007313.
 * @author Sean A. Irvine
 */
public class A007313 extends A000364 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final ArrayList<Z> mP = new ArrayList<>();
  private int mN = 0;
  {
    mP.add(Z.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mP.add(super.next());
    return RING.reversion(RING.create(mP), mN).coeff(mN);
  }
}

