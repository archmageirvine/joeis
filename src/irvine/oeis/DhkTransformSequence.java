package irvine.oeis;

import java.util.Collections;

import irvine.math.Mobius;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * DHK transform.
 * @author Sean A. Irvine
 */
public class DhkTransformSequence implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  /**
   * Compute the DHK transform of the given polynomial.
   * @param p polynomial
   * @return DHK transform
   */
  public static Polynomial<Q> dhk(final Polynomial<Q> p, final int n) {
    final Polynomial<Q> px2 = p.substitutePower(2, n);
    final Polynomial<Q> q = RING.divide(RING.subtract(
      RING.series(RING.pow(RING.add(RING.one(), p), 2, n),
        RING.subtract(RING.one(), px2), n),
      RING.one()), Q.TWO);
    Polynomial<Q> sum = RING.subtract(RING.pow(p, 2, n), px2);
    for (int d = 1; d <= n; ++d) {
      final int m = Mobius.mobius(d);
      if (m != 0) {
        final Polynomial<Q> s = RING.series(RING.one(), RING.subtract(RING.one(), p), n / d).substitutePower(d, n);
        final Polynomial<Q> log = RING.log(s, n);
        final Polynomial<Q> a = RING.divide(log, new Q(d));
        final Polynomial<Q> b = RING.subtract(a, q.substitutePower(d, n));
        sum = RING.signedAdd(m == 1, sum, b);
      }
    }
    return RING.add(p, RING.divide(sum, Q.TWO));
  }

  private final Sequence mSeq;
  private final Polynomial<Q> mA = RING.create(Collections.emptyList());
  private int mN = -1;

  /**
   * Construct a new DHK transform sequence.
   * @param seq underlying sequence.
   */
  public DhkTransformSequence(final Sequence seq) {
    mSeq = seq;
    mA.add(Q.ZERO);
    mA.add(new Q(mSeq.next()));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mA.add(new Q(mSeq.next()));
    return dhk(mA, mN).get(mN).toZ();
  }
}
