package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a389.A389804;

/**
 * A390083 The number of irreducible zero-sum subsets of T(n) = {-2*n+1, -2*n+3, ..., -3, -1, 1, 3, ..., 2*n-3, 2*n-1} that contain -2*n+1 but not 2*n-1.
 * @author Sean A. Irvine
 */
public class A390083 extends A389804 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).subtract(1).divide2();
  }
}
