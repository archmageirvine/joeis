package irvine.oeis.a002;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000260;

/**
 * A002712 Number of unrooted triangulations of a disk that have reflection symmetry with n interior nodes and 3 nodes on the boundary.
 * @author Sean A. Irvine
 */
public class A002712 extends A000260 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mD = new ArrayList<>();
  private Polynomial<Q> mJ = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mD.add(new Q(super.next()));
    mD.add(Q.ZERO);
    final Polynomial<Q> d = RING.create(mD);
    final Polynomial<Q> a = RING.subtract(RING.multiply(mJ, mJ, mN), d);
    final Polynomial<Q> b = RING.multiply(a, mJ, mN);
    final Polynomial<Q> c = RING.add(RING.divide(mJ, Q.TWO).shift(1), RING.one());
    final Polynomial<Q> e = RING.multiply(b, c, mN);
    mJ = RING.add(RING.add(RING.one(), mJ.shift(1)), e.shift(2));
    return mJ.coeff(mN).toZ();
  }
}

