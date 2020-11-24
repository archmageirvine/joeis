package irvine.oeis.a036;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036717 G.f. satisfies A(x) = 1 + x*cycle_index(Alt(4), A(x)).
 * @author Sean A. Irvine
 */
public class A036717 implements Sequence {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final CycleIndex A4 = AlternatingGroup.create(4).cycleIndex();
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    mA = RING.add(RING.one(), A4.apply(mA, ++mN).shift(1));
    return mA.coeff(mN).toZ();
  }
}

