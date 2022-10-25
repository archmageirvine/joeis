package irvine.oeis.a058;

import irvine.math.group.DihedralGroup;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A058879 Triangle read by rows: T(n,k) = number of connected graphs with one cycle of length m = n - k + 1 and n nodes (n &gt;= 3 and 1 &lt;= k &lt;= n - 2).
 * @author Sean A. Irvine
 */
public class A058879 extends A000081 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mT = RING.empty();
  {
    setOffset(3);
    mT.add(new Q(super.next())); // 0
    mT.add(new Q(super.next())); // 1
    mT.add(new Q(super.next())); // 2
  }
  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM > mN - 2) {
      ++mN;
      mM = 1;
      mT.add(new Q(super.next()));
    }
    return new DihedralGroup(mN + 1 - mM).cycleIndex().apply(mT, mN).coeff(mN).toZ();
  }
}
