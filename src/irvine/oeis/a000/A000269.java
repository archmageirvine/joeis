package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000269 Number of trees with n nodes, 3 of which are labeled.
 * @author Sean A. Irvine
 */
public class A000269 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final A000081 mSeq = new A000081();
  private int mN = 2;
  private Polynomial<Z> mB = Polynomial.create(mSeq.next(), mSeq.next(), mSeq.next());

  @Override
  public Z next() {
    ++mN;
    mB = RING.add(mB, RING.monomial(mSeq.next(), mN));
    final Polynomial<Z> b3 = RING.pow(mB, 3, mN);
    return RING.coeff(RING.subtract(RING.multiply(b3, Z.THREE), RING.multiply(RING.multiply(b3, Z.TWO), mB, mN)),
                        RING.pow(RING.subtract(RING.one(), mB), 3, mN), mN);

  }
}
