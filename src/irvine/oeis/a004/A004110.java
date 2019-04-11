package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.GraphCycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004110 Number of n-node unlabeled graphs without endpoints (i.e., no nodes of degree <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A004110 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.NEG_ONE));
  private int mN = -1;

  @Override
  public Z next() {
    final CycleIndex pair = GraphCycleIndex.cycleIndexUpTo(++mN);
    final Polynomial<Q> gf = pair.apply(C, Integer.MAX_VALUE);
    return gf.coeff(mN).toZ();
  }
}
