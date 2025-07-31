package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a221.A221493;
import irvine.oeis.a221.A221494;

/**
 * A079145 Number of labeled semitransitive orders on n elements: (1+3)-free posets.
 * @author Sean A. Irvine
 */
public class A079145 extends A221494 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final A221493 mTSeq = new A221493();
  private final Polynomial<Q> mT = RING.empty();
  private int mN = 0;

  /** Construct the sequence. */
  public A079145() {
    super(1);
    mT.add(new Q(mTSeq.next()));
  }

  @Override
  public Z next() {
    ++mN;
    mT.add(new Q(mTSeq.next(), Functions.FACTORIAL.z(mN)));
    final Polynomial<Polynomial<Q>> s = PolynomialUtils.zxToQx(gf(mN, mN));
    final Polynomial<Q> e = RING.subtract(RING.exp(RING.x(), mN), RING.one());
    int k = -1;
    Polynomial<Q> sum = RING.zero();
    for (final Polynomial<Q> u : s) {
      sum = RING.add(sum, RING.multiply(RING.pow(e, ++k, mN), RING.substitute(u, mT, mN), mN));
    }
    return sum.coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}

