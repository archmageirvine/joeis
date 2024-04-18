package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A023024 Number of partitions of n into 4 unordered relatively prime parts.
 * @author Sean A. Irvine
 */
public class A023024 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A023024(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A023024() {
    super(4);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = parts() - 1;

  protected int parts() {
    return 4;
  }

  private Polynomial<Z> den(final int k, final int n) {
    Polynomial<Z> prod = RING.one();
    for (int i = 1; i <= parts(); ++i) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(i * k), n);
    }
    return prod;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; parts() * k <= mN; ++k) {
      final int m = Functions.MOBIUS.i((long) k);
      if (m != 0) {
        final int t = mN - parts() * k;
        sum = sum.signedAdd(m > 0, RING.coeff(RING.one(), den(k, t), t));
      }
    }
    return sum;
  }
}
