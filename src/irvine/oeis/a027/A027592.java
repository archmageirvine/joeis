package irvine.oeis.a027;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027592 Sequence satisfies T(a)=a, where T is defined below.
 * @author Sean A. Irvine
 */
public class A027592 implements Sequence {

  private Polynomial<Z> mA = Polynomial.create(0, 1, 2, 2, 4, 5);
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      mA = A027588.specialPartitionTransform(mA, mN);
    }
    return mA.coeff(mN);
  }
}
