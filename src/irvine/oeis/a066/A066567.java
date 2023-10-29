package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066567 Numbers that when incremented by the product of their digits produce a square.
 * @author Sean A. Irvine
 */
public class A066567 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (LongUtils.isSquare(++mN + ZUtils.digitProduct(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
