package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070805 a(1) = 2; a(n) = largest prime not exceeding the sum of all previous terms.
 * @author Sean A. Irvine
 */
public class A070805 extends Sequence1 {

  // We actually do sum+1 to make prev prime easier
  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.THREE;
      return Z.TWO;
    } else if (Z.THREE.equals(mSum)) {
      mSum = Z.SIX;
      return Z.THREE;
    } else {
      final Z t = Functions.PREV_PRIME.z(mSum);
      mSum = mSum.add(t);
      return t;
    }
  }
}
