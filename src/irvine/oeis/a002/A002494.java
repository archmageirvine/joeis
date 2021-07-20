package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000088;

/**
 * A002494 Number of n-node graphs without isolated nodes.
 * @author Sean A. Irvine
 */
public class A002494 extends A000088 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> CONST = Polynomial.create(1, -1);
  private final ArrayList<Z> mB = new ArrayList<>();
  private int mN = -1;

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.multiply(RING.create(mB), CONST).coeff(++mN);
  }
}
