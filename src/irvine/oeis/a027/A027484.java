package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027484 a(n) = n*(n^4-1)/2.
 * @author Sean A. Irvine
 */
public class A027484 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.pow(5).subtract(mN).divide2();
  }
}
