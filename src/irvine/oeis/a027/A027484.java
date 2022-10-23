package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A027484 a(n) = n*(n^4-1)/2.
 * @author Sean A. Irvine
 */
public class A027484 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(5).subtract(mN).divide2();
  }
}
