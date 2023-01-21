package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a054.A054966;

/**
 * A067177 Cube root of A061096(n).
 * @author Sean A. Irvine
 */
public class A067177 extends Sequence0 {

  // After R. J. Mathar

  private final Sequence mA = new A054966();
  {
    mA.next();
  }

  @Override
  public Z next() {
    final long ds = mA.next().longValueExact();
    long k = -1;
    while (true) {
      if (ZUtils.digitSum(Z.valueOf(++k).pow(3)) == ds) {
        return Z.valueOf(k);
      }
    }
  }
}
