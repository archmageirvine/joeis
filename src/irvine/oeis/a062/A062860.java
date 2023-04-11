package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062504 Triangle in which k-th row lists natural number values for the collection of riffs with k nodes.
 * @author Sean A. Irvine
 */
public class A062860 extends A062504 {

  @Override
  public Z next() {
    step();
    while (!mA.a(++mT).equals(mN)) {
      // do nothing
    }
    return Z.valueOf(mT);
  }
}
