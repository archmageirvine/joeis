package irvine.oeis.a038;

import java.util.Collections;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000107;

/**
 * A038002 Number of connected functions on n points with a single labeled point.
 * @author Sean A. Irvine
 */
public class A038002 extends A000107 {

  private int mN = -1;
  private final Polynomial<Z> mGf = RING.create(Collections.emptyList());
  private final Polynomial<Z> mGfP1 = RING.create(Collections.emptyList());

  @Override
  public Z next() {
    final Z t = super.next();
    mGf.add(t);
    mGfP1.add(++mN == 0 ? Z.ONE : t);
    return RING.multiply(mGf, mGfP1, mN).coeff(mN);
  }
}
