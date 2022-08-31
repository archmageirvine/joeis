package irvine.oeis.a058;

import irvine.math.group.DihedralGroup;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A058855 Number of 6-bead necklaces where each bead is an unlabeled rooted tree, by total number of nodes.
 * @author Sean A. Irvine
 */
public class A058855 extends A000081 {

  private static final CycleIndex D6 = new DihedralGroup(6).cycleIndex();
  private final Polynomial<Q> mA = new PolynomialRing<>(Rationals.SINGLETON).empty();

  @Override
  public Z next() {
    mA.add(new Q(super.next().max(Z.ONE)));
    final int n = mA.degree();
    return D6.apply(mA, n).coeff(n).toZ();
  }
}
