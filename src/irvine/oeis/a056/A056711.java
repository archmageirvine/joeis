package irvine.oeis.a056;

import irvine.math.group.DihedralGroup;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A056710.
 * @author Sean A. Irvine
 */
public class A056711 extends A000108 {

  private static final CycleIndex ZD3 = new DihedralGroup(3).cycleIndex();
  private final Polynomial<Q> mA = new PolynomialRing<>(Rationals.SINGLETON).empty();
  private int mN = -1;
  {
    super.next();
    mA.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mA.add(new Q(super.next()));
    return ZD3.apply(mA, ++mN).coeff(mN).toZ();
  }
}
