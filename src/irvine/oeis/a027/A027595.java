package irvine.oeis.a027;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027595 Sequence satisfies <code>T^2(a)=a</code>, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027595 implements Sequence {

  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 2, 4, 4, 6);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = A027594.specialPartitionTransform(A027594.specialPartitionTransform(mA, mN + 1), mN);
    }
    return mA.coeff(mN);
  }
}
