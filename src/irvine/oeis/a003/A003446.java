package irvine.oeis.a003;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A003446 Number of nonequivalent dissections of a polygon into n triangles by nonintersecting diagonals rooted at a cell up to rotation and reflection.
 * @author Sean A. Irvine
 */
public class A003446 extends A000108 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  private final ArrayList<Z> mCatalan = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mCatalan.add(super.next());
    final Polynomial<Z> c = RING.create(mCatalan);
    final Polynomial<Z> d = RING.add(RING.one(), c.substitutePower(2, mN).shift(1));
    final Polynomial<Z> c3 = RING.pow(c, 3, mN);
    final Polynomial<Z> gf = RING.add(RING.add(c3, RING.multiply(c.substitutePower(3, mN), Z.TWO)), RING.multiply(RING.multiply(d, c.substitutePower(2, mN), mN), Z.THREE));
    return gf.coeff(mN - 1).divide(6);
  }
}
