package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067851.
 * @author Sean A. Irvine
 */
public class A067944 extends Sequence1 {

  private long mN = 1;
  private Z mRep = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = mRep.multiply(10);
      mRep = t.add(1);
      if (t.mod(++mN) == 0) {
        return t.divide(mN);
      }
    }
  }
}
