package irvine.oeis.a161;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161051 Number of partitions of 2n into powers of two where every part appears at least twice.
 * @author Georg Fischer
 */
public class A161051 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN; // current index
  protected int mOccur; // number of occurrences of the parts

  /**
   * Empty constructor
   */
  public A161051() {
    this(1, 2);
  }
  
  /**
   * Constructor with number of occurrences,
   * used by A161052-A161063  generated with partcapp.
   * @param offset index of the first term of the sequence
   * @param occur minimal number of occurrences of the parts
   */
  public A161051(final int offset, final int occur) {
    mOccur = occur;
    mN = offset - 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    int expon = 1;
    for (int k = 1; k <= mN && mOccur * expon <= mN; ++k) {
      prod = RING.multiply(prod, RING.add(RING.one(),
         RING.series(RING.monomial(Z.ONE, mOccur * expon), RING.oneMinusXToTheN(expon), mN)), mN);
      expon <<= 1; // powers of 2
    }
    return prod.coeff(mN);
  }

}
