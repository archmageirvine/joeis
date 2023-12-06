package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067081.
 * @author Sean A. Irvine
 */
public class A067184 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      Z a = Z.ZERO;
      for (final Z p : Jaguar.factor(++mN).toZArray()) {
        a = a.add(p.square());
      }
      a = a.subtract(LongUtils.digitSumSquares(mN));
      if (a.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
