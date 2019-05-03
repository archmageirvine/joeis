package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;
import irvine.oeis.a061.A061702;

/**
 * A000380 Number of permutations of an n-sequence discordant with three given permutations (see reference) in <code>n-3</code> places.
 * @author Sean A. Irvine
 */
public class A000380 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> BASE = Polynomial.create(-1, 1);
  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = coeff() - 1;

  protected int coeff() {
    return 3;
  }

  @Override
  public Z next() {
    Polynomial<Z> s = RING.zero();
    ++mN;
    for (int k = 0; k <= mN; ++k) {
      final Z t = mF.factorial(mN - k).multiply(A061702.t(mN, k));
      s = RING.add(s, RING.multiply(RING.pow(BASE, k, coeff()), t));
    }
    return s.coeff(coeff());
  }
}
