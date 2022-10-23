package irvine.oeis.a027;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027585 Sequence satisfies T^2(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027585 extends Sequence0 {

  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 3);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = A027584.specialPartitionTransform(A027584.specialPartitionTransform(mA, mN + 1), mN);
    }
    return mA.coeff(mN);
  }
}
