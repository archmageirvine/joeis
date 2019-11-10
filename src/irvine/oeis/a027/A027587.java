package irvine.oeis.a027;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027587 Sequence satisfies <code>T^2(a)=a</code>, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027587 implements Sequence {

  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 3, 3, 5);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = A027584.specialPartitionTransform(A027584.specialPartitionTransform(mA, mN + 1), mN);
    }
    return mA.coeff(mN);
  }
}
