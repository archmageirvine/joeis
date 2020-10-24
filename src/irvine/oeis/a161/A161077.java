package irvine.oeis.a161;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161077 Number of partitions of n into primes or 1 where every part appears at least 2 times.
 * @author Georg Fischer
 */
public class A161077 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Fast mPrime = new Fast();
  protected int mN; // current index
  protected int mOccur; // number of occurrences of the parts

  /**
   * Empty constructor
   */
  public A161077() {
    this(1, 2);
  }
  
  /**
   * Constructor with number of occurrences,
   * used by A161078-A161089 generated with partcapp.
   * @param offset index of the first term of the sequence
   * @param occur minimal number of occurrences of the parts
   */
  public A161077(final int offset, final int occur) {
    mOccur = occur;
    mN = offset - 1;
  }
  
  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int expon = 1; expon <= mN; expon = (int) mPrime.nextPrime(expon)) { // loop over 1 and primes
      prod = RING.multiply(prod, RING.add(RING.one(),
        RING.series(RING.monomial(Z.ONE, mOccur * expon), RING.oneMinusXToTheN(expon), mN)), mN);
    }
    return prod.coeff(mN);
  }

}
