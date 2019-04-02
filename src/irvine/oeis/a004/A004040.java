package irvine.oeis.a004;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import irvine.oeis.a000.A000257;

/**
 * A004040 Inversion of A000257.
 * @author Sean A. Irvine
 */
public class A004040 extends A000257 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    mA.add(super.next().negate());
    return RING.coeff(RING.one(), RING.create(mA), mA.size() - 1);
  }
}
