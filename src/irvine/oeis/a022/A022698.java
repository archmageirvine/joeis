package irvine.oeis.a022;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A022698 Expansion of <code>Product_{m&gt;=1} 1/(1 + m*q^m)^6</code>.
 * @author Sean A. Irvine
 */
public class A022698 extends A022634 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mD = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mD.add(super.next());
    return RING.coeff(RING.one(), mD, ++mN);
  }
}
