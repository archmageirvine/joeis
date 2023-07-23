package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007122;

/**
 * A005219 Number of unlabeled identity unit interval graphs.
 * @author Sean A. Irvine
 */
public class A005219 extends AbstractSequence {

  private final A007122 mSeq1 = new A007122();

  /** Construct the sequence. */
  public A005219() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private int mN = 0;
  private final List<Q> mA = new ArrayList<>();

  {
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mA.add(new Q(mSeq1.next()));
    final Polynomial<Q> c = RING.create(mA);
    Polynomial<Q> e = RING.zero();
    for (int k = 1; k <= mN; ++k) {
      e = RING.signedAdd((k & 1) == 1, e, RING.divide(c.substitutePower(k, mN), new Q(k)));
    }
    return RING.exp(e, mN).coeff(mN).toZ();
  }
}
