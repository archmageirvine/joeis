package irvine.oeis.a000;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000707 Number of permutations of [1,2,...,n] with n-1 inversions.
 * @author Sean A. Irvine
 */
public class A000707 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private final ArrayList<Polynomial<Z>> mTerms = new ArrayList<>();

  @Override
  public Z next() {
    ++mN;
    final long[] t = new long[mN + 1];
    Arrays.fill(t, 1);
    mTerms.add(Polynomial.create(t));
    Polynomial<Z> prod = RING.one();
    for (final Polynomial<Z> p : mTerms) {
      prod = RING.multiply(prod, p, mN);
    }
    return prod.coeff(mN);
  }
}
