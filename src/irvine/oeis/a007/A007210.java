package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007210.
 * @author Sean A. Irvine
 */
public class A007210 implements Sequence {

  // Because of the circularity in the definition of this sequence it cannot be
  // implemented simply by using PartitionTransformSequence.

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected final List<Z> mA = new ArrayList<>();
  {
    init();
  }
  protected Polynomial<Z> mB =  null;
  private int mN = -1;

  protected void init() {
    mA.add(Z.ONE);
    mA.add(Z.TWO);
    mA.add(Z.THREE);
  }

  @Override
  public Z next() {
    if (++mN == mA.size()) {
      Polynomial<Z> den = RING.one();
      Z prev = null;
      for (final Z term : mA) {
        if (!term.equals(prev)) {
          prev = term;
          den = RING.multiply(den, RING.oneMinusXToTheN(term.intValueExact()), mN);
        }
      }
      mB = RING.series(RING.one(), den, mN);
      // Second partition transform
      den = RING.one();
      prev = null;
      for (int k = 1; k <= mB.degree(); ++k) {
        final Z coeff = mB.coeff(k);
        if (!coeff.equals(prev)) {
          prev = coeff;
          den = RING.multiply(den, RING.oneMinusXToTheN(coeff.intValueExact()), mN + 1);
        }
      }
      mA.add(RING.coeff(RING.one(), den, mN + 1));
    }
    return mA.get(mN);
  }
}

