package irvine.oeis.a067;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067553 Sum of products of terms in all partitions of n into odd parts.
 * @author Sean A. Irvine
 */
public class A067553 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A067553(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A067553() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> product = RING.one();
    for (int k = 1; k <= mN; k += 2) {
      product = RING.multiply(product, RING.series(RING.one(), RING.oneMinusXToTheN(Z.valueOf(k), k), mN), mN);
    }
    return product.coeff(mN);
  }
}

