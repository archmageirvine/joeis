package irvine.oeis.a161;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161026 Number of partitions of n into Fibonacci numbers where every part appears at least 2 times.
 * This version directly implements the formula <code>Product(1+x^(2*F(j))/(1-x^(F(j))), j=2..infinity)</code>.
 * It becomes slow for n &gt; 32.
 * @author Georg Fischer
 */
public class A161026 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN; // current index
  protected int mOccur; // number of occurrences of the parts

  /**
   * Construct the sequence.
   */
  public A161026() {
    this(0, 2);
  }
  
  /**
   * Constructor with number of occurrences,
   * used by A161027-A161038 generated with partcapp.
   * @param offset index of the first term of the sequence
   * @param occur minimal number of occurrences of the parts
   */
  public A161026(final int offset, final int occur) {
    mOccur = occur;
    mN = offset - 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    long f0 = 0;
    long f1 = 1;
    Polynomial<Z> prod = RING.one();
    for (int k = 2; k <= mN; ++k) {
      final long expon = f0 + f1; // Fibonacci
      if (expon <= mN) {
        final int e = (int) expon;
        prod = RING.multiply(prod, RING.add(RING.one(),
          RING.series(RING.monomial(Z.ONE, mOccur * e), RING.oneMinusXToTheN(e), mN)), mN);
      }
      f0 = f1; 
      f1 = expon; // recurrence
    }
    return prod.coeff(mN);
  }

}
