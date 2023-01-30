package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061266 Number of squares between n^3 and (n+1)^3.
 * @author Sean A. Irvine
 */
public class A061266 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.THREE;
    }
    return Z.valueOf(mN + 1).pow(3).subtract(1).sqrt().subtract(Z.valueOf(mN).pow(3).add(1).sqrt());
  }
}
