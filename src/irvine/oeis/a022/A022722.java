package irvine.oeis.a022;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A022722 Expansion of <code>Product_{m&gt;=1} (1+m*q^m)^(-30)</code>.
 * @author Sean A. Irvine
 */
public class A022722 extends A022658 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mD = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mD.add(super.next());
    return RING.coeff(RING.one(), mD, ++mN);
  }
}
