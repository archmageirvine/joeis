package irvine.oeis.a046;

import irvine.math.group.DihedralGroup;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A046342 Number of 3-bead necklaces where each bead is a planted trivalent plane tree [or anything else enumerated by the Catalan numbers], by total number of nodes.
 * @author Sean A. Irvine
 */
public class A046342 extends A000108 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final CycleIndex D6 = new DihedralGroup(3).cycleIndex();
  private final Polynomial<Q> mC = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mC.add(new Q(super.next()));
    return D6.apply(mC, ++mN).coeff(mN).toZ();
  }
}
