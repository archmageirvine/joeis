package irvine.oeis.a022;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A022742 Expansion of Product (1-m*q^m)^-18; m=1..inf.
 * @author Sean A. Irvine
 */
public class A022742 extends A022678 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mD = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mD.add(super.next());
    return RING.coeff(RING.one(), mD, ++mN);
  }
}
