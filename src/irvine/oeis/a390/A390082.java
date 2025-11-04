package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a389.A389803;

/**
 * A390082 The number of irreducible zero-sum subsets of {-n..n} that contain -n but not n.
 * @author Sean A. Irvine
 */
public class A390082 extends A389803 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.subtract(t).subtract(1).divide2();
  }
}
