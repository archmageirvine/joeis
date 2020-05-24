package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032105 Number of series-reduced dyslexic identity planted planar trees with n leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032105 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());
  private int mN = 0;
  {
    mA.add(Z.ZERO);
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      mA.add(Z.TWO);
      return Z.TWO;
    }
    mA.add(Z.ZERO);
    final Z t = A032101.bhk(mA).coeff(mN);
    mA.set(mA.degree(), t);
    return t;
  }
}
