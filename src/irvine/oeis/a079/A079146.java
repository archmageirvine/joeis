package irvine.oeis.a079;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a221.A221492;
import irvine.oeis.a221.A221494;

/**
 * A079146 Number of unlabeled semitransitive orders on n elements: (1+3)-free posets.
 * @author Sean A. Irvine
 */
public class A079146 extends A221494 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final A221492 mTSeq = new A221492();
  private final Polynomial<Z> mT = RING.empty();
  private int mN = 0;

  /** Construct the sequence. */
  public A079146() {
    super(1);
    mT.add(mTSeq.next());
  }


  @Override
  public Z next() {
    ++mN;
    mT.add(mTSeq.next());
    final Polynomial<Polynomial<Z>> s = gf(mN, mN);
    final Polynomial<Z> e = RING.series(RING.x(), RING.oneMinusXToTheN(1), mN);
    int k = -1;
    Polynomial<Z> sum = RING.zero();
    for (final Polynomial<Z> u : s) {
      sum = RING.add(sum, RING.multiply(RING.pow(e, ++k, mN), RING.substitute(u, mT, mN), mN));
    }
    return sum.coeff(mN);
  }
}

