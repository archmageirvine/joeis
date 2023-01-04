package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060833 Separate the natural numbers into disjoint sets A, B with 1 in A, such that the sum of any 2 distinct elements of the same set never equals 2^k + 2. Sequence gives elements of set A.
 * @author Sean A. Irvine
 */
public class A060833 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        Z t = mA;
        mA = mA.add(1);
        t = t.makeOdd();
        if (t.mod(4) == 3) {
          break;
        }
      }
    }
    return mA;
  }
}
