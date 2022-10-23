package irvine.oeis.a027;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027589 Sequence satisfies T^2(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027589 extends Sequence0 {

  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 3, 4);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = A027588.specialPartitionTransform(A027588.specialPartitionTransform(mA, mN + 1), mN);
    }
    return mA.coeff(mN);
  }
}
