package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066355 A055471(n)/(product of nonzero digits of A055471(n)).
 * @author Sean A. Irvine
 */
public class A066355 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long nz = ZUtils.digitNZProduct(++mN, 10);
      if (mN % nz == 0) {
        return Z.valueOf(mN / nz);
      }
    }
  }
}
