package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A023893 Number of partitions of n into prime power parts <code>(1</code> included); number of nonisomorphic Abelian subgroups of symmetric group <code>S_n</code>.
 * @author Sean A. Irvine
 */
public class A023893 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence primes = new A000040();
    Polynomial<Z> prod = RING.oneMinusXToTheN(1);
    for (int p = primes.next().intValue(); p <= mN; p = primes.next().intValueExact()) {
      for (int q = p; q <= mN; q *= p) {
        prod = RING.multiply(prod, RING.oneMinusXToTheN(q), mN);
      }
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

