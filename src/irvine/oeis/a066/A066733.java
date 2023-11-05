package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066733 Numbers such that the nonzero product of the digits of its square is also a square.
 * @author Sean A. Irvine
 */
public class A066733 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long prod = ZUtils.digitProduct(++mN * mN);
      if (prod != 0 && LongUtils.isSquare(prod)) {
        return Z.valueOf(mN);
      }
    }
  }
}
