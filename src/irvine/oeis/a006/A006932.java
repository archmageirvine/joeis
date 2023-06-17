package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006932 Number of permutations of [n] with at least one strong fixed point (a permutation p of {1,2,...,n} is said to have j as a strong fixed point if p(k) &lt; j for k &lt; j and p(k) &gt; j for k &gt; j).
 * @author Sean A. Irvine
 */
public class A006932 extends AbstractSequence {

  /** Construct the sequence. */
  public A006932() {
    super(1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mCoeff = new ArrayList<>();

  {
    mCoeff.add(Z.ONE);
  }

  protected Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mCoeff.add(mF);
    final Polynomial<Z> t = RING.create(mCoeff);
    return mF.subtract(RING.coeff(t, RING.add(RING.one(), t.shift(1)), mN));
  }
}
