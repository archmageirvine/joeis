package irvine.oeis.a027;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027597 Sequence satisfies T(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027597 extends Sequence0 {

  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 2, 4, 5);
  private int mN = 0;

  protected Z select(final Z a, final Z b) {
    return a;
  }

  @Override
  public Z next() {
    final Polynomial<Z> b = A027594.specialPartitionTransform(mA, mN + 1);
    if (++mN > mA.degree()) {
      mA = A027594.specialPartitionTransform(b, mN);
    }
    return select(mA.coeff(mN), b.coeff(mN));
  }
}
