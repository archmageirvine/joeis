package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007836 Springer numbers associated with symplectic group.
 * @author Sean A. Irvine
 */
public class A007836 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 0, 1);
  private Polynomial<Z> mP = RING.x();
  private Polynomial<Z> mQ = RING.one();
  private boolean mFirst = true;

  private void step() {
    mQ = RING.add(RING.multiply(RING.diff(mQ), C), mQ.shift(1));
    mP = RING.multiply(RING.diff(mP), C);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    step();
    return RING.eval(mP, Z.ONE).subtract(RING.eval(mQ, Z.ONE));
  }
}
