package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061702;

/**
 * A000380 Number of permutations of an n-sequence discordant with three given permutations (see reference) in n-3 places.
 * @author Sean A. Irvine
 */
public class A000380 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000380(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000380() {
    super(3);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> BASE = Polynomial.create(-1, 1);
  private int mN = coeff() - 1;

  protected int coeff() {
    return 3;
  }

  @Override
  public Z next() {
    Polynomial<Z> s = RING.zero();
    ++mN;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Functions.FACTORIAL.z(mN - k).multiply(A061702.t(mN, k));
      s = RING.add(s, RING.multiply(RING.pow(BASE, k, coeff()), t));
    }
    return s.coeff(coeff());
  }
}
