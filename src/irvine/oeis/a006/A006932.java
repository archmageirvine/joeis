package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006932 Number of permutations of <code>[n]</code> with at least one strong fixed point <code>(a</code> permutation p of <code>{1,2,...,n}</code> is said to have j as a strong fixed point if p(k) <code>&lt; j</code> for <code>k &lt; j</code> and p(k) <code>&gt; j</code> for <code>k &gt; j)</code>.
 * @author Sean A. Irvine
 */
public class A006932 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mCoeff = new ArrayList<>();
  {
    mCoeff.add(Z.ONE);
  }
  private Z mF = Z.ONE;
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
