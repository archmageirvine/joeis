package irvine.oeis.a010;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010816 Expansion of Product_{k&gt;=1} (1 - x^k)^3.
 * @author Sean A. Irvine
 */
public class A010816 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private int mM = 1;
  private Polynomial<Z> mGf = Polynomial.create(1, -power());

  protected int power() {
    return 3;
  }

  @Override
  public Z next() {
    if (++mN > mM) {
      mM <<= 1;
      mGf = RING.one();
      for (int k = 1; k <= mM; ++k) {
        mGf = RING.multiply(mGf, RING.pow(RING.oneMinusXToTheN(k), power(), mM), mM);
      }
    }
    return mGf.coeff(mN);
  }
}
